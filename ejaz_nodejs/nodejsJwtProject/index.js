import express from "express";
import dotenv from "dotenv";
import userRoutes from "./routes/userRoutes.js";
import mongoose from "mongoose";

const app = express();
dotenv.config();
app.use(express.json());
mongoose
  .connect("mongodb://localhost:27017/user")
  .then(() => {
    console.log("Database connect successfully");
  })
  .catch((err) => console.log(err));

app.use(userRoutes);

app.listen(process.env.PORT, () => {
  console.log(`Server is up and runnning ${process.env.PORT}`);
});
