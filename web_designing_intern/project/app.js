// Function to render all products on the home page
function renderProducts() {
  const container = document.getElementById("product-container");
  if (!container) return; // Exit if not on the home page

  container.innerHTML = "<p>Loading products...</p>";

  fetch("https://dummyjson.com/products")
    .then((res) => res.json())
    .then((data) => {
      let containerHTML = "";

      data.products.forEach((element) => {
        // We add an onclick event to navigate to the single product page with the ID
        containerHTML += `
          <div class="product-card" onclick="viewProduct(${element.id})">
            <img src="${element.thumbnail}" alt="${element.title}"/>
            <h2>${element.title}</h2>
            <span class="description">${element.description}</span>
          </div>
        `;
      });

      container.innerHTML = containerHTML;
    })
    .catch((err) => console.error("Error fetching products:", err));
}

// Function to navigate to single product page
function viewProduct(id) {
  window.location.href = `product.html?id=${id}`;
}

// Function to render a single product based on the URL ID
function renderSingleProduct() {
  const container = document.getElementById("single-product-container");
  if (!container) return; // Exit if not on the product page

  // Get the ID from the URL (e.g., product.html?id=5)
  const urlParams = new URLSearchParams(window.location.search);
  const productId = urlParams.get("id");

  if (!productId) {
    container.innerHTML = "<h2>Product not found</h2>";
    return;
  }

  container.innerHTML = "<p>Loading product details...</p>";

  // Fetch the specific product
  fetch(`https://dummyjson.com/products/${productId}`)
    .then((res) => res.json())
    .then((product) => {
      container.innerHTML = `
        <div class="single-product">
          <div class="single-product-image">
            <img src="${product.thumbnail}" alt="${product.title}">
          </div>
          <div class="single-product-info">
            <h1>${product.title}</h1>
            <p class="price">$${product.price}</p>
            <p>${product.description}</p>
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

// Initialize the correct function based on the page
document.addEventListener("DOMContentLoaded", () => {
  renderProducts();
  renderSingleProduct();
});
