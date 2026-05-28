// module

const { add, multiply } = require("./localModules");

const os = require("os");
const path = require("path");
const fs = require("fs");

// console.log(os.cpus());
// console.log(os.totalmem());
// console.log(os.freemem());

// console.log(os.hostname());
// console.log(os.homedir());

// console.log(os.platform());

// console.log(os.uptime());

// console.log(os.machine());

// console.log(os.userInfo());

console.log(path.basename("/src/index.js"));

console.log(path.extname("index.js"));

console.log(path.extname("index.pdf"));

console.log(path.join("src", "program", "index.js"));

console.log(path.dirname("/src/program/index.js"));

fs.writeFileSync("example.txt", "Hello express\n ");

fs.appendFileSync("example.txt", " second line");

const file = fs.readFileSync("example.txt");

console.log(file.toString());

// setTimeout(() => {

//     fs.unlinkSync("example.txt");
// }, 10000);

// global objects

console.log(__dirname);

console.log(__filename);

// timing function

setTimeout(() => {
  console.log("settimeout");
}, 3000);

const id = setInterval(() => {
    console.log("interval");
    
}, 3000);

setTimeout(() => {
    clearInterval(id);
}, 20000);


// bulit-in (nodejs has)
// local modules  (developer created)
// third-party modules  (npm )

// npm => node package manager

let data = 10;

let name = "Redmi";

data = "Fiit";
name = 50;

console.log(data, name);

let result = add(10, 40);
console.log(result);

multiply(20, 40, 5);
