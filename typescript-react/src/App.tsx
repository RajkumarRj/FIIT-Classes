import { useState } from "react";

import "./App.css";

const styled = {
  border: "2px solid black",
  padding: "10px",
  width: "30%",
  textAlign: "center",
};

function App() {
  const [count, setCount] = useState(0);

  return (
    <>
      <h1 className="text-2xl font-bold border-2 p-5 m-3 text-center">
        Hello there typescript
      </h1>

      <div className="border-2 p-2 m-2 flex justify-center items-center flex-col flex-wrap sm:flex-row  gap-3">
        <div style={styled}>item</div>
        <div style={styled}>item</div>
        <div style={styled}>item</div>
        <div style={styled}>item</div>
        <div style={styled}>item</div>
        <div style={styled}>item</div>
        <div style={styled}>item</div>
        <div style={styled}>item</div>
      </div>
    </>
  );
}

export default App;
