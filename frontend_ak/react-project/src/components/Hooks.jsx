import React, { useEffect, useState } from "react";

const Hooks = () => {
  const [count, setCount] = useState(0);

  const [name, setName] = useState("FIIT");

  useEffect(() => {
    document.title = count;
    console.log(count);
  }, [count]);

  // without dependency array
  // with empty dependency array
  // with state dependency

  return (
    <div>
      <h2>Counter</h2>
      <h1>{count}</h1>
      <h2>{name}</h2>
      <button onClick={() => setName("Redmi")}>Name change </button>

      <button onClick={() => setCount(count - 1)}>-</button>
      <button onClick={() => setCount(count + 1)}>+</button>

      <button onClick={() => setCount(0)}>Reset</button>
    </div>
  );
};

export default Hooks;
