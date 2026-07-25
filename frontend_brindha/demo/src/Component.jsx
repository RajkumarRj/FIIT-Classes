import React, { useEffect, useState } from "react";
import axios from "axios";

const Component = ({ name, age }) => {
  // console.log(props);

  const [data, setData] = useState([]);

  const fetchData = async () => {
    const result = await axios.get(
      "https://jsonplaceholder.typicode.com/todos",
    );
    // console.log(result.data);
    setData(result.data);
  };

  // side effect
  useEffect(() => {
    fetchData();
    // console.log("hello there");
  }, []);
  // no depdency => runs on every render
  // [] => runs only on mount
  // [count] => runs when that state change

  return (
    <div>
      <h1>jkhkjhkj</h1>
      <h1>{name}</h1>
      <h2>{age}</h2>

      {/* list rendering  */}

      <div
        style={{
          display: "flex",
          justifyContent: "center",
          alignItems: "center",
          flexWrap: "wrap",
        }}
      >
        {data.map((ele) => {
          return (
            <div
              key={ele.id}
              style={{
                width:"200px",
                height:"200px",
                border: "2px solid black",
                color: "white",
                margin: "20px",
                padding: "20px",
                backgroundColor: "#333",
              }}
            >
              <h1>{ele.title}</h1>
            </div>
          );
        })}
      </div>
    </div>
  );
};

export default Component;
