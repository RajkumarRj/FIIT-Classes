import mongoose from "mongoose";

const userSchema = new mongoose.Schema(
  {
    name: { type: String },
    email: { type: String, unique: true },
    password: { type: String },
  },
  { timestamps: 1 },
);


const USER = mongoose.model("jwt", userSchema);

export default USER;
