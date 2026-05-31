const fs = require("fs");
const path = require("path");
const os = require("os");

const logFile = path.join(__dirname, "logs.txt");

function logInfo(message) {
  console.log(message);
  fs.appendFileSync(logFile, `${message} \n`);
}

function systemInfo() {
    console.log("systeminfo");
    
  fs.appendFileSync(
    logFile,
    `System : ${os.hostname} | platform: ${os.platform}\n`,
  );
} 

module.exports = { logInfo, systemInfo };
