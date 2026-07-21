import React from "react";

export const Component1 = () => {
  return <h1>Hello there</h1>;
};

const Component = ({ name, age, countVar }) => {
  // props = {
  //   name:"FIIT"
  // }
  return (
    <div>
      <h2>Component </h2>
      <h1>Component</h1>
      {/* <h1>{props.name}</h1> */}
      {/* <h1>{props.age}</h1> */}
      <h1>{name}</h1>
      <h1>{age}</h1>
      <h1>{countVar}</h1>
    </div>
  );
};

export default Component;
