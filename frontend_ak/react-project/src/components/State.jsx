import React, { useState } from "react";
import Child from "./Child";

const State = () => {
  const [data, setdata] = useState(100);
  const [count, setCount] = useState(200);

  console.log(data);

  return (
    <div>
      <h2>{data}</h2>
      <h2>State component</h2>
      <Child result = {400}  count = {count} />
    </div>
  );
};

export default State;
