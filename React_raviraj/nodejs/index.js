
// REST API => curd - create , update, read,, delete

const express = require("express")

const app = express();
const userRoutes = require("./routes/userRoutes")


app.use(express.json());

app.use(userRoutes);


app.listen(3000, ()=>{
    console.log("Server is up and running"); 
})
   




