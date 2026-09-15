import React, { useEffect, useState } from "react";

const Condition = () => {
  const [isloggedIn, setIsLoggedIn] = useState(true);

  //   list rendering

  const [data, setData] = useState([
    {
      name: "jeeva",
      age: 20,
    },
    { name: "Boomika", age: 20 },
    { name: "Praveen", age: 20 },
    { name: "Mohamad", age: 20 },
  ]);

  useEffect(() => {
    console.log("useeffectd");
  }, [isloggedIn]);

  //   no depedency => runs on every updates or render
  // [] array => runs only once
//   based on state => runs when that state changes 


  return (
    <div>
      <h1>Conditional renderingggggkjljlkg</h1>

      {data.map((ele, index) => {
        return (
          <div key={index}>
            <h1>
              {ele.name} - {ele.age}{" "}
            </h1>
          </div>
        );
      })}

      {isloggedIn ? <h1>Welcome to our webiste</h1> : <h1>Please log in </h1>}
    </div>
  );
};

export default Condition;
