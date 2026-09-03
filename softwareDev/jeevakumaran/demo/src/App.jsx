import { useState } from "react";
import heroImg from "./assets/hero.png";
import reactLogo from "./assets/react.svg";
import viteLogo from "./assets/vite.svg";
import "./App.css";
import Jeeva from "./Jeeva";

function App() {
  const [res, setRes] = useState(0);

  return (
    <div>
      {/* props */}

      <h1>{res}</h1>

      <button onClick={() => setRes(res + 1)}>Increment</button>
      <br />
      <button onClick={() => setRes(res - 1)}>Decrement</button>
      <br />
      <button onClick={() => setRes(0)}>Reset</button>

      <Jeeva name="Jeeva" age="30" />
      <Jeeva name="Fiit" age="20" />
      <Jeeva name="Mohan" age={40} />
      <Jeeva name="naren" age={90} />
      <Jeeva name="Harish" age={25} />
    </div>
  );
}

export default App;
