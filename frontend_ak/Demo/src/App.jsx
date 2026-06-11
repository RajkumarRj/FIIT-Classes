import { useState } from "react";
import Heading from "./Heading";

function App() {
  const [data, setData] = useState(50);

  const handleClick = () => {
    console.log("Button clicked");
    
    setData((data) => data + 1);
  };
  return (
    <div>
      <h1>React {data}</h1>

      <button onClick={() => handleClick()}>Data increment</button>

      <Heading />
      <Heading />

      <Heading />

      <Heading />

      <Heading />
      <Heading />
    </div>
  );
}

export default App;
