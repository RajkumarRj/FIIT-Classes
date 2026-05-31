const { systemInfo, logInfo } = require("./logger");

systemInfo();

logInfo("Application started");

const id = setInterval(() => {
  logInfo("Heartbeat");
}, 5000);

setTimeout(() => {
  clearInterval(id);
  logInfo("Application stopped");
}, 30000);
