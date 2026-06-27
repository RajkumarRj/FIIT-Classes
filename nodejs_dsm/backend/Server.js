import express from "express";


const app = express();



app.get("/home" , (req,res)=>{
    //endpoint

    return res.send("GET method is working fine");
})




app.listen(10000, ()=>{
    console.log("Server is up and running");
})