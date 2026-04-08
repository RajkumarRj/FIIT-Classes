const USER = require("../model/userModel");
const bcrypt = require("bcryptjs");
const jwt = require("jsonwebtoken");

const getUser = async (req, res) => {
  const user = await USER.find({});
  res.json({
    message: "Server is working ",
    user,
  });
};

const signupController = async (req, res) => {
  const { name, email, password } = req.body;
  console.log(req.body.name);

  const existingEmail = await USER.findOne({ email });

  const hashedPassword = await bcrypt.hash(password, 10);

  if (existingEmail) {
    return res.status(400).json({ message: "Email is already registered " });
  }

  const newUser = await USER.create({
    name,
    email,
    password: hashedPassword,
  });

  res.status(201).json({
    message: "User registered successfully",
    user: newUser,
  });
};

const loginController = async (req, res) => {
  const { email, password } = req.body;

  const existingEmail = await USER.findOne({ email });
  console.log(existingEmail);

  if (!existingEmail) {
    return res.json({ message: "Email not found try to sign in again " });
  }

  const passCheck = await bcrypt.compare(password, existingEmail.password);
  if (!passCheck) {
    return res.json({ message: "Password is not matching" });
  }

  const payload = {
    id: existingEmail._id,
    name: existingEmail.name,
    email,
  };

  const token = await jwt.sign(payload, process.env.SECRET_KEY, {
    expiresIn: "1h",
  });

  res.json({
    message: "loged in successfully ",
    jwt_token: token,
  });
};

const demoController = async (req, res) => {
  res.json({ message: "demo controller", user: req.user });
};

module.exports = {
  getUser,
  signupController,
  loginController,
  demoController,
};
