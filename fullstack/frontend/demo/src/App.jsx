import { useState } from "react";
import reactLogo from "./assets/react.svg";
import viteLogo from "./assets/vite.svg";
import heroImg from "./assets/hero.png";
import "./App.css";

import axios from "axios";
import { useEffect } from "react";

function App() {
  const [response, setResponse] = useState([]);
  const [name, setName] = useState("");
  const [age, setAge] = useState("");

  const connect = async () => {
    const result = await axios.get("http://localhost:3000/api/v1");
    setResponse(result.data);
  };

  useEffect(() => {
    connect();
  }, []);

  const addUser = async () => {
    const newUser = { name, age: parseInt(age) };

    await axios.post("http://localhost:3000/api/v1", newUser);
    setResponse([...response, newUser]);
    setName("");
    setAge("");
  };
  return (
    <>
      <h2>Hello react</h2>

      <input
        type="text"
        value={name}
        placeholder="Enter your name"
        onChange={(e) => setName(e.target.value)}
      />

      <br />
      <br />
      <input
        type="number"
        value={age}
        placeholder="Enter your age"
        onChange={(e) => setAge(e.target.value)}
      />
      <br />
      <br />

      <button onClick={addUser}>Post </button>

      {response.map((ele, index) => (
        <div key={index}>
          <h2>{ele.name}</h2>
          <h2>{ele.age}</h2>
        </div>
      ))}
    </>
  );
}

export default App;
