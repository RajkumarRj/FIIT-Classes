import { useState } from "react";
import "./App.css";
import Component from "./Component";
import Hooks from "./Hooks";
import Memo from "./Memo";

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
      <Memo/>

      {/* jsx  */}
    </>
  );
}

export default App;
