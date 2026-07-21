import React, { useEffect, useState } from "react";
import Component from "./Component";

const State = () => {
  const [data, setData] = useState(false);

  //   array of object
  const [names, setNames] = useState([
    {
      id: 1,
      name: "Alice Johnson",
      email: "alice@example.com",
      isActive: true,
      roles: ["Admin", "User"],
      profile: {
        age: 28,
        city: "New York",
      },
    },
    {
      id: 2,
      name: "Bob Smith",
      email: "bob@example.com",
      isActive: false,
      roles: ["User"],
      profile: {
        age: 34,
        city: "San Francisco",
      },
    },
    {
      id: 1,
      name: "Alice Johnson",
      email: "alice@example.com",
      isActive: true,
      roles: ["Admin", "User"],
      profile: {
        age: 28,
        city: "New York",
      },
    },
    {
      id: 2,
      name: "Bob Smith",
      email: "bob@example.com",
      isActive: false,
      roles: ["User"],
      profile: {
        age: 34,
        city: "San Francisco",
      },
    },
  ]);

  useEffect(() => {
    console.log(data);
  }, [data]);

  //   empty dependency => runs on every renders
  // empty array => runs on mount phase
  // [depedency] => runs when depedency changes
  //   component lifecycle => mount, update, unmount
  return (
    <div>
      {names.map((ele) => {
        return (
          <div
            style={{
              border: "2px solid black",
              margin: "10px",
              backgroundColor: "#333",
              color: "white",
              textAlign:"center" 
            }}
          >
            <h2>{ele.name}</h2>
            <h2>{ele.email}</h2>
            <h2>{ele.roles[0]}</h2>
          </div>
        );
      })}

      <h1>{data}</h1>

      <button onClick={() => setData(true)}>Login</button>
      <button onClick={() => setData(false)}>Logout</button>
      {data ? <Component /> : <h2>Logout</h2>}
    </div>
  );
};

export default State;
