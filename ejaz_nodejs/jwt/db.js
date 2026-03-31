import mongoose from "mongoose";

export const  connect = async () => {
  try {
    await mongoose.connect("mongodb://localhost:27017/lookup");
    console.log("Mongo db is connected");
  } catch (error) {
    console.log(error);
    console.log(error.message);
  }
//   mongoose
//     .connect("mongodb://localhost:27017/lookup")
//     .then(() => {
//       console.log("Database connect successfully");
//     })
//     .catch((err) => console.log(err));
//   }


};
