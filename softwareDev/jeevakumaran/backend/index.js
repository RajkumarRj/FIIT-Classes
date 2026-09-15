import http from "http";

const server = http.createServer((req, res) => {
  if (req.url == "/") {
    return res.end("Hello world");
  } else if ((req.url == "/home")) {
    return res.end("Home route");
  } else {
    return res.end("Not found");
  }
});

server.listen(3000, () => {
  console.log("Server is up and running");
});
