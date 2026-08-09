import { useState } from "react";
import reactLogo from "./assets/react.svg";
import viteLogo from "./assets/vite.svg";
import heroImg from "./assets/hero.png";
import "./App.css";
import { BrowserRouter, Link, Route, Routes } from "react-router-dom";
import Product from "./Product";
import SinglePage from "./SinglePage";

function App() {
  const [count, setCount] = useState(0);

  return (
    <>
      <h1 className="text-blue-400">React-router example</h1>

      <BrowserRouter>
        <Link to={"/"}>Home</Link>
        <Routes>
          <Route path="/" element={<Product />} />

          <Route path="/products/:id" element={<SinglePage />} />
        </Routes>
      </BrowserRouter>
    </>
  );
}

export default App;
