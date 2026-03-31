import User from "../model/userModel.js";
import jwt from "jsonwebtoken";

export const getUser = async (req, res) => {
  try {
    const row = await User.find({});

    res.status(200).json({ message: "API is working fine", data: row });
  } catch (error) {
    res.status(500).json({ message: "Something went wrong" });
  }
};

export const signupController = async (req, res) => {
  try {
    const { name, email, password, role } = req.body;

    const existingEmail = await User.findOne({ email });

    if (existingEmail) {
      return res.status(400).json({ message: "email is already registered" });
    }

    const newUser = await User.create({
      name,
      email,
      password,
      role: role || "user",
    });

    res.status(201).json({
      success: true,
      message: "User created successfully",
      user: newUser,
    });
  } catch (error) {
    res
      .status(500)
      .json({ message: "Error has occured", error: error.message });
  }
};

export const loginController = async (req, res) => {
  try {
    const { email, password } = req.body;

    const existsUser = await User.findOne({ email }).select("+password");
    if (!existsUser) {
      return res.status(400).json({ message: "Email is not found " });
    }
    const match = await existsUser.comparePassword(password);

    if (!match) {
      return res.status(400).json({ message: "password is not match" });
    }
    const payload = {
      id: existsUser._id,
      name: existsUser.name,
      email,
      role: existsUser.role,
    };

    const token = await jwt.sign(payload, "secretKey", { expiresIn: "1h" });
    
    res
      .status(200)
      .json({ message: "Logged in successfully", JWT_token: token });
  } catch (error) {
    res.status(500).json({ message: error.message });
  }
};

export const listUser = async (req, res) => {
  res.json({
    message: "Hello authentication user",
    user: req.user,
  });
};

export const demoController = async (req, res) => {
  res.json({
    message: "token working fine ",
    user: req.user,
  });
};
