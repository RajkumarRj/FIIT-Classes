import { useState } from "react";
import reactLogo from "./assets/react.svg";
import viteLogo from "./assets/vite.svg";
import heroImg from "./assets/hero.png";
import "./App.css";
import { useDispatch, useSelector } from "react-redux";
import { decrement, increment, reset } from "./store/counterSlice";
import { login } from "./store/userSlice";
import Tailwind from "./Tailwind";

function App() {
  const count = useSelector((state) => state.counter.data);
  const dispatch = useDispatch();

  const { name, isLoggedIn } = useSelector((state) => state.user);
  console.log(name, isLoggedIn);

  // zustand
  return (
    <>
      {/* {count}
      <h2 className="text-3xl  p-6 m-6 border-3 border-sky-300 text-yellow-600  ">Redux</h2>
      <h1>{name}</h1>

      <button onClick={() => dispatch(login("FIIT"))}>Login</button>

      <button
        onClick={() => {
          dispatch(increment());
        }}
      >
        Increment
      </button>

      <button onClick={() => dispatch(decrement())}>decrement</button>
      <button onClick={() => dispatch(reset())}>Reset</button>

      <button>dfg</button> */}

      {/* <h2>Tailwind CSS</h2> */}

      <Tailwind/>
    </>
  );
}

export default App;
