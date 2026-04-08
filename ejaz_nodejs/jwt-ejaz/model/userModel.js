const mongoose = require("mongoose");

const userSchema = new mongoose.Schema({
  name: {
    type: String,
  },
  email: {
    type: String,
    unique: true,
  },

  password: {
    type: String,
  },
}, {timestamps:true});


const USER = mongoose.model("ejazjwt" , userSchema);


module.exports = USER;

