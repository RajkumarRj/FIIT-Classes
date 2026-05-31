
// event emitter 
const eventEmitter = require("events");


const events = new eventEmitter();

// register
events.on("click", function(){
    console.log("User is clicked", );
    
})


events.emit("click" );

events.emit("click" );


events.once("salary", function(){
    console.log("salary credited for this month");
    
})

events.emit("salary")


events.emit("salary");

let buffer = Buffer.alloc(50);

buffer.write("Hello world");


console.log(buffer);
console.log(buffer.toString());


let buffer1 = Buffer.from("Hello FIIT academy");

console.log(buffer1.length);

console.log(buffer1.toString());








