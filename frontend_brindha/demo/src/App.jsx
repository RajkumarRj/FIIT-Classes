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
import { BrowserRouter, Route, Routes, useNavigate } from "react-router-dom";
import Header from "./Header";
import Home from "./Home";
import About from "./About";
import Product from "./Product";
import { useDispatch, useSelector } from "react-redux";
import { decrement, increment, reset } from "./store/CounterSlice";
function App() {
  const [count, setCount] = useState(10);

  const handleClick = () => {
    setCount(count + 1);
    // count+1;
  };

  const data = useSelector((state) => state.counter.value);

  console.log(data);

  const dispatch = useDispatch();

  return (
    <>
      <h1>{data}</h1>
      <button
        className="bg-blue-700 border p-2 text-white "
        onClick={() => dispatch(increment())}
      >
        Increment
      </button>
      <button
        className="bg-blue-700 border p-2 text-white "
        onClick={() => dispatch(decrement())}
      >
        Decrement
      </button>
      <button
        className="bg-blue-700 border p-2 text-white "
        onClick={() => dispatch(reset())}
      >
        Reset
      </button>

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
      <h1>kdfjal</h1>

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
