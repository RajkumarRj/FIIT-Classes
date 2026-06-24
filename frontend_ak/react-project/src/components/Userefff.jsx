import React, { useRef } from "react";

const Userefff = () => {
  const inputref = useRef();

  const focusInput = () => {
    inputref.current.focus();
  };

  return (
    <div>
      <h2>UseRef</h2>

      <input type="text" ref={inputref} placeholder="Enter your name.." />

      <button onClick={focusInput}>Click</button>
    </div>
  );
};

export default Userefff;
