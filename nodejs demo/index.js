import event from "events";


const eventEmitter = new event();

eventEmitter.on("greet", () => {
  console.log("Greeting event");
});

eventEmitter.once("EventRunsOnlyOnce" , ()=>{
    setTimeout(() => {
        console.log("EventsRunsOnlyOnce");
        
    }, 2000);
})

eventEmitter.emit("greet");
eventEmitter.emit("greet");

eventEmitter.emit("EventRunsOnlyOnce");
eventEmitter.emit("EventRunsOnlyOnce");








// console.log("Hello world");


// // runtime environment 

// // chrome javascript v8 
// // v8 + core module + js => node js 


// // js = single threaded 

// // nodejs => global objects


// console.log(__dirname);

// console.log(__filename);
// console.log(globalThis);

// // timeout

// // js => async -> callback function 
// setTimeout(() => {
//     console.log("settimeout");
// }, 1000);


// const timerId = setInterval(()=>{
//     console.log("Set inteval");
// },2000)


// setTimeout(() => {
//     clearInterval(timerId);
// }, 10000);



// //event emitter 

// // nodejs => event-driven architecture 

// // js => onclick , mouse, keyboard -> browser events 

// // nodejs => event