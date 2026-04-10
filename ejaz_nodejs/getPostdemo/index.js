const express = require("express");
const dotenv = require("dotenv");
const dummy = require("./dummy.json");

const app = express();

app.use(express.json());

dotenv.config();

app.get("/list", (req, res) => {
  res.json(dummy);
});

app.post("/edit", (req, res) => {
  console.log(req.body);

  const { id, name, password } = req.body;

  const result = dummy.find((dummy) => dummy.id === id);

  if (result) {
    return res.json({ message: "THis data is already in database" });
  }
  const newUser = {
    id,
    name,
    password,
  };
  dummy.push(newUser);
  res.json({ message: "post method is working fine ", dummy });
});

app.listen(process.env.PORT || 3000, () => {
  console.log(`Server is up and running ${process.env.PORT}`);
});
