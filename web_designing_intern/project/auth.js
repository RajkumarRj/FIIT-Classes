
function signupUser(name, email, password) {
  const users = JSON.parse(localStorage.getItem("users")) || [];

  const exists = users.find((u) => u.email === email);
  if (exists) {
    alert("User already exists");
    return;
  }

  users.push({ name, email, password });
  localStorage.setItem("users", JSON.stringify(users));

  alert("Signup successful!");
  window.location.href = "login.html";
}

// Login user
function loginUser(email, password) {
  const users = JSON.parse(localStorage.getItem("users")) || [];

  const user = users.find((u) => u.email === email && u.password === password);

  if (!user) {
    alert("Invalid credentials");
    return;
  }

  localStorage.setItem("currentUser", JSON.stringify(user));
  window.location.href = "index.html";
}

// Logout
function logout() {
  localStorage.removeItem("currentUser");
  window.location.reload();
}

// Navbar update
function checkAuth() {
  const user = JSON.parse(localStorage.getItem("currentUser"));

  const userInfo = document.getElementById("user-info");
  const loginLink = document.getElementById("login-link");
  const logoutLink = document.getElementById("logout-link");

  if (user) {
    userInfo.innerText = "Hi, " + user.name;
    loginLink.style.display = "none";
    logoutLink.style.display = "inline";

    ```
logoutLink.onclick = logout;
```;
  }
}

document.addEventListener("DOMContentLoaded", checkAuth);
