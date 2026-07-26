import React, { useContext } from "react";
import UseContext from "./UseContext";

const Consumer = () => {
  const { name, email } = useContext(UseContext);
  console.log("consume component");

  return (
    <div>
      <h2>fasfadfas</h2>
      <h1>{name}</h1>
      <h1>{email}</h1>
    </div>
  );
};

export default Consumer;
