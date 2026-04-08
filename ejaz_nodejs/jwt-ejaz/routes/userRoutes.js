const express = require("express");
const {
  getUser,
  signupController,
  loginController,
  demoController,
} = require("../controller/userController");
const { authMiddleware } = require("../auth/authMiddleware");


const router = express.Router();

router.get("/",authMiddleware, getUser);
router.post("/register", signupController);
router.post("/login", loginController);

router.get("/demo" , authMiddleware ,demoController);

// router.get('/data',authMiddleware, dataController);

module.exports = router;
