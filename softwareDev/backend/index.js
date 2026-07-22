import express from "express";

const app = express();

// api => application programming interface

app.get("/", (req, res) => {
  res.send("Home route working fine");
});

app.listen(3000, () => {
  console.log("Server is up and running");
});
