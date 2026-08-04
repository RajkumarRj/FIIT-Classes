import express from "express";

const app = express();
app.use(express.json());

app.all("/product/search", (req, res) => {
  if (req.method !== "QUERY") {
    return res.status(405).json({ message: "Method not allowed use query" });
  }

  const { filters, sortBy } = req.body;

  console.log("Received QUERY Payload:", req.body);

  const dummyResults = [
    { id: 101, name: "Wireless Mouse", price: 25 },
    { id: 102, name: "Mechanical Keyboard", price: 85 },
  ];

  res.status(200).json({
    success: true,
    message: "Product query api working fine ",
  });
});

app.listen(3000, () => {
  console.log("Server is up and running");
});
