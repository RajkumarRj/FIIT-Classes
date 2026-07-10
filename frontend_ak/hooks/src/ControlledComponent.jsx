
import React, { useState } from "react";
import { Button } from "react-bootstrap";
// import styles from "./styles.modules.css"

export const container = {
  backgroundColor: "blue",
  padding: "10px",
  color: "red",
};

const ControlledComponent = () => {
  const [name, setName] = useState("");
  const [age, setAge] = useState(0);

  const handleSubmit = (e) => {
    e.preventDefault();
    console.log(name);
    console.log(age);
    setName("");
    setAge(0);
  };

  return (
    <div>
      <form action="">
        Name :{" "}
        <input
          type="text"
          value={name}
          onChange={(e) => setName(e.target.value)}
          placeholder="Enter your name"
        />
        <br />
        Age :{" "}
        <input
          type="number"
          value={age}
          onChange={(e) => setAge(e.target.value)}
          placeholder="Enter your age"
        />
        <br />
        {/* <button type="Submit" onClick={(e) => handleSubmit(e)}>
          Submit
        </button> */}
        <Button variant="primary">Bootstrap Button</Button>
      </form>
    </div>
  );
};

export default ControlledComponent;
