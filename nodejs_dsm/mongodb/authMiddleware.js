import jwt from "jsonwebtoken";

export const authMiddleware = async (req, res, next) => {
  try {
    const headToken = req.headers["authorization"];

    if (!headToken) {
      return res.json("Token not found");
    }

    const token = headToken.split(" ")[1];
    console.log(token);

    const isVerified = jwt.verify(token, "123");

    console.log(isVerified);

    next();
  } catch (error) {
    res.json("TOken is invalid or expires");
  }
};
