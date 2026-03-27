const db = require("../db");
const bcrypt = require("bcryptjs");
const jwt = require("jsonwebtoken");

const registerUser = async (req, res) => {
  const { name, password } = req.body;

  const hashedPassword = await bcrypt.hash(password, 10);

  await db.query("INSERT INTO user (name, password) VALUES( ?,?) ", [
    name,
    hashedPassword,
  ]);
  res.json("User created successfully");
};

const login = async (req, res) => {
  const { name, password } = req.body;

  const [rows] = await db.query("SELECT * FROM user WHERE name = ?", [name]);

  if (rows.length === 0) {
    return res.send("username not found please register");
  }

  const user = rows[0];
  const isMatch = await bcrypt.compare(password, user.password);
  if (!isMatch) return res.send("Password not match");

  const token = jwt.sign({ id: user.id }, "secretkey", { expiresIn: "1h" });

  res.json({
    user,
    token,
  });
};


const authMiddleware = async (req,res,next )=>{
  const token = req.headers["authorization"]
  console.log(req.headers);
  console.log(req.headers.authorization);

  if (!token) return res.json({ message: "Access denied" });
  try {
    const verified = jwt.verify(token, "secretkey");
    req.user = verified;
    next();
  } catch (err) {
    res.status(400).json({ message: "Invalid token" });
  }
};

const getUser = async (req, res) => {
  const [rows] = await db.query("SELECT * FROM user");

  res.json(rows);
};

module.exports = {
  registerUser,
  getUser,
  login,
  authMiddleware
};
