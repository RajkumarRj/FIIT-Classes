import axios from "axios";
import React, { useEffect, useState } from "react";
import { api } from "./api";
import { Button } from "react-bootstrap";


const AxiosComponent = () => {
  const [data, setData] = useState([]);
  const [name, setName] = useState("");

  const fetchData = async () => {
    const result = await api.get("/users");

    console.log(result.data);
    setData(result.data);
  };

  useEffect(() => {
    fetchData();
  }, []);

  const handleSubmit = async (e) => {
    e.preventDefault();

    try {
      const result = await axios.post(
        "https://jsonplaceholder.typicode.com/users",
        { name },
      );
      console.log(result.data);
      setData((prev) => [...prev, result.data]);
      setName("");
    } catch (error) {
      console.log(error);
    }
  };

  const Updateuser = async () => {
    try {
      const result = await axios.put(
        "https://jsonplaceholder.typicode.com/users/1",
        { name: "REDMI" },
      );

      console.log(result);
      
    } catch (error) {
      console.log(error);
    }
  };

  return (
    <div>
      <Button>Bootstrap button</Button>
      <h2>Axios</h2>
      <button onClick={Updateuser}>Update</button>

      {/* list rendering */}
      <form onSubmit={handleSubmit}>
        <input
          type="text"
          value={name}
          onChange={(e) => setName(e.target.value)}
          placeholder="Enter your name"
        />

        <button type="submit">Add</button>
      </form>
      

      {data.map((ele) => {
        return (
          <div key={ele.id}>
            <p>{ele.name}</p>
          </div>
        );
      })}
    </div>
  );
};

export default AxiosComponent;
