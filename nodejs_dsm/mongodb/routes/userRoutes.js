import express from "express";
import { addUser, getAllUsers, loginUser } from "../controller/userController.js";
import { authMiddleware } from "../authMiddleware.js";


const router = express.Router();

router.get("/" ,  authMiddleware , getAllUsers);
router.post("/add", addUser);
router.post("/login", loginUser);


export default router;
