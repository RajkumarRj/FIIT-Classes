import { useState } from "react";
import Component, { Component1 } from "./Component";
import State from "./State";

function App() {
  // react hoooks
  const [count, setCount] = useState(0);

  return (
    <div>
      {/* <h1>{count}</h1>

      <button onClick={() => setCount(count + 1)}>Increment</button>
      <button onClick={() => setCount(count - 1)}>Decrement</button>
      <button onClick={()=>setCount(10)}>Reset</button>
      <h1>React</h1> */}

      {/* props  */}
      {/* <Component name="fiidsfadt" age="20" countVar = {count}/>

      <Component1 /> */}

      <State />
     
    </div>
  );
}

export default App;
