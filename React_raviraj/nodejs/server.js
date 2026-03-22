const express = require("express");
const jwt = require("jsonwebtoken");
const dotenv = require("dotenv");

dotenv.config();

const app = express();

app.use(express.json());

const user = {
  id: 1,
  username: "ravi",
  password: "12345",
};

app.post("/login", (req, res) => {
  const { username, password } = req.body;

  if (username === user.username && password === user.password) {
    const token = jwt.sign(
      { id: user.id, username: user.username },
      process.env.SECRET,
      { expiresIn: "1h" },
    );
    res.json({ token });
  } else {
    res.send("invalid user name and password");
  }
});

const authMiddleware = async (req,res,next )=>{
  const token = req.headers["authorization"]
  console.log(req.headers);
  console.log(req.headers.authorization);

  if (!token) return res.json({ message: "Access denied" });
  try {
    const verified = jwt.verify(token, process.env.SECRET);
    req.user = verified;
    next();
  } catch (err) {
    res.status(400).json({ message: "Invalid token" });
  }
};

app.get("/profile", authMiddleware, (req, res) => {
  res.json({ message: "Welcome to your file", user: req.user });
});

app.listen(process.env.PORT, () => {
  console.log("Server is up and running");
});





