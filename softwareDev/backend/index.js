import express from "express";
import cors from "cors";

const app = express();

app.use(express.json()); 

app.use(cors());
// api => application programming interface
const users = [
  { name: "Praveen" },
  { name: "Shemar" },
  { name: "Jamuna" },
  { name: "Boomika" },
];
app.get("/", (req, res) => {
  // res.send("Home route working fine");
  res.json({ message: "Data fetched successfully", user: users });
});

app.post("/register", (req, res) => {
  console.log(req.body);
  const { name, course } = req.body;
  let newObj = {
    name,
    course,
  };
  users.push(newObj);

  res.json({message:"User added successfully", user:users})
});
app.listen(3000, () => {
  console.log("Server is up and running");
});
