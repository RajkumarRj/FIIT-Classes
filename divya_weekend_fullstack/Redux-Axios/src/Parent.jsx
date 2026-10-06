import React, { act, useReducer } from "react";
import Child from "./Child";
import { useDispatch, useSelector } from "react-redux";
import { increment } from "./redux/counterSlice";

// function reducer(state, action) {
//   switch (action.type) {
//     case "increment":
//       return { value: state.value + 1 };
//     case "decrement":
//       return { value: state.value - 1 };
//   }
// }

const Parent = () => {
  const count = useSelector((state) => state.counter);
  const dispatch = useDispatch();
  //   const [count, dispatch] = useReducer(reducer, { value: 0 });

  return (
    <div>
      <h1>{count}</h1>

      <button onClick={() => dispatch(increment())}>Increment</button>

      {/* <h1>Parent</h1>
      <h1>{count.value}</h1>
      <button onClick={() => dispatch({ type: "increment" })}>Increment</button>
      <button onClick={() => dispatch({ type: "decrement" })}>Decrement</button> */}
      {/* <Child  name = "Divya" course = "Java full stack "/> */}
    </div>
  );
};

export default Parent;
