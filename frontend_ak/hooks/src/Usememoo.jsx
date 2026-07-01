import React from "react";
import MemoChild from "./MemoChild";
import { useState } from "react";
import { useCallback } from "react";
import { useMemo } from "react";

const Usememoo = () => {
  console.log("memo parent rendered");

  const [count, setCount] = useState(0);
  const [num, setNum] = useState(1);

  const handClick = () => {
    setCount((prev) => prev + 1);
  };

  const display = useCallback(() => {
    console.log("Greet");
  }, []);

  const expensiveCalculation = useMemo(() => {
    console.log("expensive");

    return num * 100000000;
  }, [num]);

  return (
    <div>
      <h1>{expensiveCalculation}</h1>
      <h1>Use memo</h1>
      <h2>{count}</h2>

      <button onClick={handClick}>Add</button>

      <MemoChild content="memooo" buttonClick={display} />
    </div>
  );
};

export default Usememoo;
