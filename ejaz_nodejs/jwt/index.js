import express from "express"
import dotenv from "dotenv"
import  {connect}  from "./db.js";
import userRoutes from "./routes/userRoutes.js";


dotenv.config();

const app = express();
connect();
app.use(userRoutes);




app.listen(process.env.PORT || 3000 , ()=>{
    console.log(`Server is running ${process.env.PORT}`);
    
})