import axios from "axios";
import React, { useEffect, useState } from "react";

const AxiosDemo = () => {
  // fetch vs axios
  const [user, setUser] = useState([]);

  const fetchUser = async () => {
    try {
      const response = await axios.get(
        "https://jsonplaceholder.typicode.com/users",
      );
        // console.log(response.data);

      setUser(response.data);
    } catch (error) {
      console.error("error occured", error);
    }
  };

  const createUser = async () => {
    const newUser = {
      name: "DIvya",
      username: "Divya123",
      email: "divya@gmail.com",
      company: { name: "Google" },
    };

    try {
      const response = await axios.post(
        "https://jsonplaceholder.typicode.com/users",
        newUser,
      );

      //   console.log(response.data);

      setUser([response.data, ...user]);
    } catch (error) {
      console.error("Error occured", error);
    }
  };

  const deleteUser = async (id) => {
    try {
      await axios.delete(`https://jsonplaceholder.typicode.com/users/${id}`);

      setUser(user.filter((ele) => ele.id !== id));
    } catch (error) {
      console.error("Error occured", error);
    }
  };

  useEffect(() => {
    fetchUser();
  }, []);

  // axios is used for api calls
  return (
    <div>
      <h1>Axios</h1>

      <button onClick={createUser}>Create User + </button>

      {user.map((ele) => {
        return (
          <div
            key={ele.id}
            style={{
              border: "2px solid green",
              margin: "10px 4px",
              padding: "10px",
            }}
          >
            <h4>{ele.name}</h4>
            <p>{ele.email}</p>
            <button onClick={() => deleteUser(ele.id)}>Delete</button>
          </div>
        );
      })}
    </div>
  );
};

export default AxiosDemo;


// usecontext 

// prop drilling 

// props 