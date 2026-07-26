import React, { useReducer, useState } from "react";

const UseReducer = () => {
  // const [count, setCount] = useState({count : 0});

  const reducer = (state, action) => {
    if (action.type === "increment") {
      console.log(action.color);

      return { count: state.count + 1 };
    } else if (action.type === "decrement") {
      return { count: state.count - 1 };
    }else if(action.type === "reset"){
      return {count : 0}
    }
  };
  const [count, dispatch] = useReducer(reducer, { count: 1 });

  return (
    <div>
      <h1>useReducer</h1>
      <h1>{count.count}</h1>

      <button onClick={() => dispatch({ type: "increment", color: "Blue" })}>
        Add
      </button>

      <button onClick={() => dispatch({ type: "decrement" })}>Decrement</button>

      <button onClick={() => dispatch({ type: "reset" })}>Reset</button>
    </div>
  );
};

export default UseReducer;
