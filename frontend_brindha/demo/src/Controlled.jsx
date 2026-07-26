import React, { useState } from "react";

const Controlled = () => {
  const [name, setName] = useState("");
  const handleSubmit = (e) => {
    e.preventDefault();
    console.log(name);

    console.log("Form submitted");
  };
  return (
    <div>
      <h1>Controlled component</h1>

      <form onSubmit={(e) => handleSubmit(e)}>
        <input
          type="text"
          value={name}
          onChange={(e) => setName(e.target.value)}
          placeholder="Enter your name .."
        />
        <button type="submit">Submit</button>
      </form>
    </div>
  );
};

export default Controlled;
