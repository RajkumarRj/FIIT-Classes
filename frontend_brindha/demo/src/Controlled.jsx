import React, { useState } from "react";
import { Button } from "react-bootstrap";
const Controlled = () => {
  const [name, setName] = useState("");
  const handleSubmit = (e) => {
    e.preventDefault();
    console.log(name);

    console.log("Form submitted");
  };
  return (
    <div>
      <h1 style={{ backgroundColor: "#333", color: "white" }}>
        Controlled component
      </h1>

      <form onSubmit={(e) => handleSubmit(e)}>
        <input
          type="text"
          value={name}
          onChange={(e) => setName(e.target.value)}
          placeholder="Enter your name .."
        />
        <button type="submit">Submit</button>
      </form>

      <Button variant="secondary">FIIT </Button>
    </div>
  );
};

export default Controlled;
