
let globalProducts = []; // Stores fetched products for quick cart lookup
let cart = JSON.parse(localStorage.getItem("cart")) || []; // Pulls saved cart or creates empty array

// --- AUTHENTICATION & ROUTING ---
function enforceAuth() {
  const user = JSON.parse(localStorage.getItem("currentUser"));
  const currentPath = window.location.pathname.toLowerCase();
  
  const isLoginPage = currentPath.includes("login.html");
  const isSignupPage = currentPath.includes("signup.html");
  const isPublicPage = isLoginPage || isSignupPage;

  if (!user && !isPublicPage) {
    if (!currentPath.endsWith("login.html")) window.location.replace("login.html");
    return false;
  }

  if (user && isPublicPage) {
    window.location.replace("index.html");
    return false;
  }

  if (user) {
    const userInfo = document.getElementById("user-info");
    const loginLink = document.getElementById("login-link");
    const signupLink = document.getElementById("signup-link");
    const logoutBtn = document.getElementById("logout-btn");

    if (userInfo) userInfo.innerText = `Hi, ${user.name}`;
    if (loginLink) loginLink.style.display = "none";
    if (signupLink) signupLink.style.display = "none";
    if (logoutBtn) {
      logoutBtn.style.display = "inline";
      logoutBtn.addEventListener("click", (e) => {
        e.preventDefault();
        localStorage.removeItem("currentUser");
        window.location.href = "login.html";
      });
    }
  }
  return true;
}

// --- PRODUCT RENDERING ---
function renderProducts() {
  const container = document.getElementById("product-container");
  if (!container) return;

  container.innerHTML = "<p>Loading products...</p>";

  fetch("https://dummyjson.com/products")
    .then((res) => res.json())
    .then((data) => {
      globalProducts = data.products; // Save to global state for cart logic
      let containerHTML = "";
      
      data.products.forEach((element) => {
        // Only image and title are clickable to go to product details. 
        // Button acts independently.
        containerHTML += `
          <div class="product-card">
            <img src="${element.thumbnail}" alt="${element.title}" style="cursor:pointer;" onclick="window.location.href='product.html?id=${element.id}'"/>
            <h3 style="cursor:pointer;" onclick="window.location.href='product.html?id=${element.id}'">${element.title}</h3>
            <p>$${element.price}</p>
            <button class="add-to-cart-btn" onclick="addToCart(${element.id})">Add to Cart</button>
          </div>
        `;
      });
      container.innerHTML = containerHTML;
    })
    .catch((err) => console.error("Error fetching products:", err));
}

function renderSingleProduct() {
  const container = document.getElementById("single-product-container");
  if (!container) return;

  const urlParams = new URLSearchParams(window.location.search);
  const productId = urlParams.get("id");

  if (!productId) {
    container.innerHTML = "<h2>Product not found</h2>";
    return;
  }

  container.innerHTML = "<p>Loading product details...</p>";

  fetch(`https://dummyjson.com/products/${productId}`)
    .then((res) => res.json())
    .then((product) => {
      // Temporarily push to global list so Add To Cart works from single page
      globalProducts.push(product); 
      
      container.innerHTML = `
        <div class="single-product">
          <div class="single-product-image">
            <img src="${product.thumbnail}" alt="${product.title}">
          </div>
          <div class="single-product-info">
            <h1>${product.title}</h1>
            <p class="price">$${product.price}</p>
            <p>${product.description}</p>
            <button class="add-to-cart-btn" onclick="addToCart(${product.id})" style="width: 200px; margin-bottom: 20px;">Add to Cart</button>
            <br>
            <p><strong>Brand:</strong> ${product.brand}</p>
            <p><strong>Category:</strong> ${product.category}</p>
            <p><strong>Rating:</strong> ${product.rating} / 5</p>
          </div>
        </div>
      `;
    })
    .catch((err) => console.error("Error fetching product:", err));
}

// --- CART LOGIC ---
function addToCart(productId) {
  const product = globalProducts.find((p) => p.id === productId);
  if (!product) return;

  const existingItem = cart.find((item) => item.id === productId);

  if (existingItem) {
    existingItem.quantity++;
  } else {
    cart.push({ id: product.id, name: product.title, price: product.price, quantity: 1 });
  }

  saveAndRenderCart();
}

function removeFromCart(productId) {
  cart = cart.filter(item => item.id !== productId);
  saveAndRenderCart();
}

function saveAndRenderCart() {
  localStorage.setItem("cart", JSON.stringify(cart)); // Save to storage
  updateCartUI(); // Update UI
}

function updateCartUI() {
  const cartItems = document.getElementById("cart-items");
  const cartTotal = document.getElementById("cart-total");
  
  if (!cartItems || !cartTotal) return; // Exit if on a page without a cart (login/signup)

  cartItems.innerHTML = "";
  let total = 0;

  if (cart.length === 0) {
    cartItems.innerHTML = "<p style='color: #aaa;'>Your cart is empty.</p>";
    cartTotal.innerText = "0.00";
    return;
  }

  cart.forEach((item) => {
    total += item.price * item.quantity;
    cartItems.innerHTML += `
      <li>
          <div>
            <strong>${item.name}</strong> <br>
            <small>$${item.price} x ${item.quantity}</small>
          </div>
          <button class="remove-btn" onclick="removeFromCart(${item.id})">X</button>
      </li>
    `;
  });

  cartTotal.innerText = total.toFixed(2);
}

// --- EVENT LISTENERS ---
document.addEventListener("DOMContentLoaded", () => {
  const isAllowed = enforceAuth();
  if (!isAllowed) return; 

  renderProducts();
  renderSingleProduct();
  updateCartUI(); // Load cart right away

  const signupForm = document.getElementById("signup-form");
  if (signupForm) {
    signupForm.addEventListener("submit", (e) => {
      e.preventDefault(); 
      const name = document.getElementById("signup-name").value;
      const email = document.getElementById("signup-email").value;
      const password = document.getElementById("signup-password").value;

      const users = JSON.parse(localStorage.getItem("users")) || [];
      if (users.find((u) => u.email === email)) {
        alert("User already exists with this email.");
        return;
      }

      users.push({ name, email, password });
      localStorage.setItem("users", JSON.stringify(users));
      alert("Signup successful! Please log in.");
      window.location.href = "login.html";
    });
  }

  const loginForm = document.getElementById("login-form");
  if (loginForm) {
    loginForm.addEventListener("submit", (e) => {
      e.preventDefault();
      const email = document.getElementById("login-email").value;
      const password = document.getElementById("login-password").value;

      const users = JSON.parse(localStorage.getItem("users")) || [];
      const user = users.find((u) => u.email === email && u.password === password);

      if (!user) {
        alert("Invalid email or password.");
        return;
      }

      localStorage.setItem("currentUser", JSON.stringify(user));
      window.location.href = "index.html";
    });
  }
});