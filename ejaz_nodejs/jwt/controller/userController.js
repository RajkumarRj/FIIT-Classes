import USER from "../Model/userModel.js";

export const getUser = async (req, res) => {
  const result = await USER.find();

  res.json(result);
};


