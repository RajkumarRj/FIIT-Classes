import { useState } from "react";
import "./App.css";
import Component from "./Component";
import Hooks from "./Hooks";
import Memo from "./Memo";
import UseReducer from "./UseReducer";
import UseContext, { UserProvider } from "./UseContext";
import Consumer from "./Consumer";
import Controlled from "./Controlled";
import "bootstrap/dist/css/bootstrap.min.css";
import Bootstrap from "./Bootstrap";
import Axios from "./Axios";
import Conditional from "./Conditional";
import { BrowserRouter, Route, Routes } from "react-router-dom";
import Header from "./Header";
import Home from "./Home";
import About from "./About";
import Product from "./Product";
function App() {
  const [count, setCount] = useState(10);

  const handleClick = () => {
    setCount(count + 1);
    // count+1;
  };

  return (
    <>
      {/* jsx  */}
      {/* <h1> {count} </h1>
      <button onClick={handleClick}>Count++</button>
      <h2>Hello there</h2> */}
      {/* <Component name="FIIT" age = "20" /> */}
      {/* <Hooks/> */}
      {/* <Memo/> */}
      {/* <UseReducer/> */}
      {/* <Consumer /> */}

      {/* <Controlled/> */}
      {/* <Bootstrap/> */}
      {/* <Axios/> */}
      <Conditional />

      {/* <UseContext /> */}
      <BrowserRouter>
        <Header />
        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/about" element={<About />} />
          <Route path="/product/:id" element={<Product />} />
        </Routes>

        <footer>
          <h1>Footer</h1>
        </footer>
      </BrowserRouter>

      {/* jsx  */}
    </>
  );
}

export default App;
