import React, { useReducer } from "react";

const UseReducerrr = () => {
  const reducer = (state, action) => {
    if (action.type == "increment") {
      console.log(action.payload);

      return { count: state.count + 1 };
    } else if (action.type == "decrement") {
      return { count: state.count - 1 };
    } else if (action.type == "reset") {
      return { count: 0 };
    }
  };
  const [state, dispatch] = useReducer(reducer, { count: 0 });

  return (
    <div>
      <h2>Use reducer</h2>

      <p>{state.count}</p>

      <button onClick={() => dispatch({ type: "increment", payload: 20 })}>
        {" "}
        Increment
      </button>

      <button onClick={() => dispatch({ type: "decrement" })}>Decrement</button>
      <button onClick={() => dispatch({ type: "reset" })}>Reset</button>
    </div>
  );
};

export default UseReducerrr;
