const jwt = require("jsonwebtoken");

const authMiddleware = async (req, res, next) => {
  const header = req.headers["authorization"];

  if (!header) {
    return res.json({ message: "Header not found " });
  }

  const token = header.split(" ")[1];

  const verified = await jwt.verify(token, process.env.SECRET_KEY);

  console.log(verified);

  req.user = verified; 

  next();
};

module.exports = {
  authMiddleware,
};
