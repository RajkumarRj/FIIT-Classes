import User from "../model/userModel.js";

export const getAllUsers = async (req, res) => {
  const result = await User.find();
  res.json(result);
};

export const addUser = async (req, res) => {
  console.log(req.body);

  const { name, email, password } = req.body;

  let newObj = {
    name,
    email,
    password,
  };

  const result = new User(newObj);

  result.save();

  res.json(result);
};
