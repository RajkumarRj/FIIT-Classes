// express js => nodejs frame work

import express from "express"; // es6

const app = express();

app.use(express.json());

let user = [{ name: "FIIT", age: 24, college: "DKM" }];

app.get("/", (req, res) => {
  return res.json(user);
});

app.post("/post", (req, res) => {
  console.log(req.body);

  user.push(req.body);

  return res.json(user);
});

app.listen(3000, () => {
  console.log("Server is up and running");
});
