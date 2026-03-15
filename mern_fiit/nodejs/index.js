const express = require("express");
require("dotenv").config();
const userRoutes = require("./routes/userRoutes")

const app = express();

app.use(express.json());

app.use(userRoutes);


app.listen(process.env.PORT, () => {
  console.log(`Server is up and running port ${process.env.PORT}`);
});

