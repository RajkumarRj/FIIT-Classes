import jwt from "jsonwebtoken";

export const authMiddleware = async (req, res, next) => {
  try {
    const authHeader = req.headers["authorization"]; 
    if (!authHeader) {
      return res.status(401).json({ message: "Authorization header missing" });
    }

    const token = authHeader.split(" ")[1]; 
    if (!token) {
      return res.status(401).json({ message: "Token not found" });
    }

    const verified = jwt.verify(token, "secretKey");

    req.user = verified;
    next();
  } catch (error) {
    res.status(500).json({ message: error.message });
  }
};

export const authorizationMiddleware = (...allowedRoles) => {
  return (req, res, next) => {
    console.log(req.user);
    
    if (!allowedRoles.includes(req.user.role)) {
      return res.status(403).json({ message: "Unauthorized user" });
    }
    next();
  };
};

