const express = require("express");
require("dotenv").config();
const cors = require("cors");
const mysql = require("mysql2/promise")

const app = express();
app.use(cors());


const pool = mysql.createPool({
    host:"localhost",
    user:"root",
    password:"raj123",
    database:"user"
})



const user = [
  { name: "Rajkumar", age: 20 },
  { name: "Ganesh", age: 22 },
];
app.get("/api/v1", async (req, res) => {
    const [data] = await pool.query("SELECT * FROM user");
  res.json(data);
});

app.post("/api/v1", (req,res)=>{

    const newUser= req.body;
    user.push(newUser);

    res.json({
        message:"Data added successfully",
        data:newUser
    })

})



app.listen(process.env.PORT, () => {
  console.log(`Server is up and running on ${process.env.PORT} `);
});
