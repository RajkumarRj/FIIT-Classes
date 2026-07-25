import React from "react";

const ChildMemo = React.memo(({ name, handleClick }) => {
  console.log("Child memo component rendered");

  return (
    <div>
      <h1>Child memo</h1>
      <h2>{name}</h2>
    </div>
  );
});

export default ChildMemo;
