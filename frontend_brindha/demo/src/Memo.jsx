import React, { useCallback, useMemo, useState } from "react";
import ChildMemo from "./ChildMemo";

const Memo = () => {
  const [count, setCount] = useState(0);
  const [number, setNumber] = useState(10);

  
  console.log("Memo component rendered");
  const handleClick = useCallback(() => {}, []);

  //use memo

  const calculation = useMemo(() => {
    console.log("calculation method");

    return number * 1000000000;
  }, [number]);

  return (
    <div>
      {calculation}

      <h1>fdsdfsdfass</h1>

      <h1>{count}</h1>

      <button onClick={() => setCount(count + 1)}>Add</button>

      <ChildMemo name="dsfadfs" handleClick={handleClick} />
    </div>
  );
};

export default Memo;
