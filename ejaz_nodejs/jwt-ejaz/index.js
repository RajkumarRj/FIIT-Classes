const express = require("express");
const dotenv = require("dotenv");
const userRoutes = require("./routes/userRoutes");
const connect = require("./config/db");

const app = express();
dotenv.config();

app.use(express.json())


connect();
app.use(userRoutes);

app.listen(process.env.PORT || 3000, () => {
  console.log(`Server is up and running ${process.env.PORT}`);
});
