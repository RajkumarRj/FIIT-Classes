const http = require("http");

// System.out.println(10);





let func = function add() {
    console.log("Add function is called");
};

// add();

func();

let funcc = ()=>{
    console.log("Arrow function");
    
}



funcc();


const server = http.createServer(  (req,res)=>{

    if(req.url == "/about"){
        console.log(req.url);
        
        return res.end("About casdfdsfasf");
        
    }else if(req.url == "/home"){
        return res.end("THis is home page");
    }else{
        return res.end("NO match routes found");
    }
})

server.listen(3000, ()=>{
    console.log("Server is up and running");
    
})


console.log(10);





// let person ={
    
// }
//  v8 => javascript enigne (chrome)

//  spider monkey => js engine (firefox)


//  2009 => rayn dahl (node js) (v8) + os moudle + path module 

//  nodejs single-threaded language and it's support asynchronous 


//  node js is non-blocking 









