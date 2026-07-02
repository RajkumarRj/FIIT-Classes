// 1. Data: Our list of products and an empty cart array
const products = [
  { id: 1, name: "Wireless Headphones", price: 99 },
  { id: 2, name: "Smart Watch", price: 149 },
  { id: 3, name: "Bluetooth Speaker", price: 59 },
  { id: 4, name: "Mechanical Keyboard", price: 120 },
];

let cart = [];

// 2. Render Products: Display products on the screen
function renderProducts() {
  const productList = document.getElementById("product-list");
  productList.innerHTML = ""; // Clear existing content

  products.forEach((product) => {
    // Create HTML for each product
    productList.innerHTML += `
            <div class="product">
                <h3>${product.name}</h3>
                <p>$${product.price}</p>
                <button onclick="addToCart(${product.id})">Add to Cart</button>
            </div>
        `;
  });
}

// 3. Add to Cart Logic
function addToCart(productId) {
  // Find the product the user clicked on
  const product = products.find((p) => p.id === productId);

  // Check if the item is already in the cart
  const existingCartItem = cart.find((item) => item.id === productId);

  if (existingCartItem) {
    // If it's already there, just increase the quantity
    existingCartItem.quantity++;
  } else {
    // If it's new, add it to the cart array with a quantity of 1
    cart.push({ ...product, quantity: 1 });
  }

  // Update the visual cart
  updateCartUI();
}

// 4. Update Cart UI: Show items and calculate total
function updateCartUI() {
  const cartItems = document.getElementById("cart-items");
  const cartTotal = document.getElementById("cart-total");

  cartItems.innerHTML = ""; // Clear the current cart display
  let total = 0;

  if (cart.length === 0) {
    cartItems.innerHTML = "<p>Your cart is empty.</p>";
    cartTotal.innerText = "0";
    return;
  }

  cart.forEach((item) => {
    // Calculate total price
    total += item.price * item.quantity;

    // Add item to the visual list
    cartItems.innerHTML += `
            <li>
                ${item.name} <br> 
                <small>$${item.price} x ${item.quantity}</small>
            </li>
        `;
  });

  // Update the total on the screen
  cartTotal.innerText = total;
}

// 5. Run this function when the page loads to show the products
renderProducts();
