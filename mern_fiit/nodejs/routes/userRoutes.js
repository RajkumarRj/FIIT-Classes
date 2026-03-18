const express = require("express");
const {
  registerUser,
  getUser,
  login,
  authMiddleware,
} = require("../controller/userController");

const router = express.Router();

router.post("/register", registerUser);
router.get("/users", getUser);
router.post("/login", login);

router.get("/profile", authMiddleware, (req, res) => {
    console.log(req.header);
    
  res.send("AUth middleware working fine ");
});
module.exports = router;


