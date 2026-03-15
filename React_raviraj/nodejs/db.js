const mysql = require("mysql2/promise")


const pool = mysql.createPool({
    host:"localhost",
    user:"root",
    password:"raj123",
    database:"raviraj"
})


module.exports = pool;