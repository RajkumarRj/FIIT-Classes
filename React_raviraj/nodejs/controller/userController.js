const pool = require("../db");

let user = [];


// const newUser = {
//   id: 1,
//   name: "Raviraj",
//   password: "ravi123",
// };
// user.push(newUser);

const getUser = async (req, res) => {

  const [rows] = await pool.query("SELECT * FROM user");
  res.json(rows);
  // res.json(user);
};

const addUser = async (req, res) => {
  const { name, password ,age} = req.body;

  await pool.query("INSERT INTO user(name, password, age) VALUES(?,?,?)",[name, password, age])
  // const newUser = {
  //   id: user.length + 1,
  //   name,
  //   password,
  // };
  // user.push(newUser);

  res.send("User created successfully");
};

const updateUser = async (req, res) => {
  const id = Number(req.params.id);
  const { name, password ,age} = req.body;

  await pool.query("UPDATE user SET name = ? , password =? , age = ? WHERE id = ?", [name, password, age ,id]);
  
  // const hasToUpdateUser = user.find((user) => user.id === id);

  // hasToUpdateUser.name = name;
  // hasToUpdateUser.password = password;


  res.json("Updated successfully");
};

const deleteUser = async (req,res)=>{
    const id = Number(req.params.id);

    // user = user.filter((user)=> user.id != id);
    await pool.query("DELETE FROM user WHERE id=?",[id]);

    res.json({
        message:"user deelted successfully"
    })
}

module.exports = {
  getUser,
  addUser,
  updateUser,
  deleteUser
};
