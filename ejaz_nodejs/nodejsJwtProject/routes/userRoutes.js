import express from "express";
import {
  demoController,
  getUser,
  listUser,
  loginController,
  signupController,
} from "../controller/userController.js";
import {
  authMiddleware,
  authorizationMiddleware,
} from "../auth/authController.js";

const router = express.Router();

router.get("/user", getUser);
router.post("/signup", signupController);
router.post("/login", loginController);
router.get("/profile", authMiddleware, listUser);
router.get(
  "/demo",
  authMiddleware,
  authorizationMiddleware("admin"),
  demoController,
);

export default router;
