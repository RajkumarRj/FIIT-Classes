import express from "express";
import fs from "fs";

const app = express();

app.use(express.json());

// app.use((req,res,next)=>{
//     const content = `${req.url}  - ${new Date().toISOString()}`
//     fs.appendFileSync("Log_system.txt",content);
//     console.log("Request hit the middleware ");
//     next();
// })

const student = [
  {
    id: 1,
    name: "FIIT",
    course: "MERN stack",
  },
  {
    id: 2,
    name: "REDMI",
    cours: "JAVA full Stack",
  },
];

app.get("/list", (req, res) => {
  //endpoint
  return res.json(student);
});


app.post("/post", (req,res)=>{
    console.log(req.body);
        
    student.push(req.body);  
    
    return res.json(student);
})

app.put("/update/:id", (req,res)=>{
    const studId = parseInt(req.params.id);

    const index = student.findIndex((e) => e.id === studId);

    if(index !== -1){
      return res.json(student[index]); 
    }

    return res.send("Datas not found");
    
})








app.listen(10000, () => {
  console.log("Server is up and running");
});
