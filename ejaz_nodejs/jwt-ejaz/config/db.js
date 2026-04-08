const mongoose = require('mongoose')



const connect = async () => {
    
    try {
        await mongoose.connect("mongodb://localhost:27017/ejaz");
        console.log("Mongodb connected");
        
    } catch (error) {
        console.log(error.message);
        
    }
}


module.exports = connect;