import express from "express";
import rateLimit from "express-rate-limit"

const app = express();


const limiter = rateLimit({
    windowMs : 10 * 1000,
    limit : 5,
    handler : (req,res)=>{
        res.status(429).json({
            message:"Too many request try again later"
        })
    }
})

app.use(limiter);


app.get("/api/home", (req,res)=>{
    res.send("Home router");
})

app.listen(3000, () => {
  console.log("server is up and running");
});
