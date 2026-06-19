import React, { useEffect, useState } from "react";

const List = () => {

    const arr = [1, 2, 3, 4, 5, 6, 7, 8,,10,11,22];

  const obj = [
    { name: "Arun", college: "Karan", Degree: "BSC" },
    { name: "Kumari", college: "Karan", Degree: "BCA" },
    { name: "Arun", college: "Karan", Degree: "BSC" },

    { name: "Arun", college: "Karan", Degree: "BSC" },

    { name: "Arun", college: "Karan", Degree: "BSC" },

    { name: "Arun", college: "Karan", Degree: "BSC" },
  ];



  return (
    <div>
      <h1>List</h1>

      {obj.map((ele, index) => {
        return (
          <div
            key={index}
            style={{
              border: "2px solid black",
              backgroundColor: "#333",
              color: "white",
              textAlign: "center",
              padding: "40px",
              margin: "10px",
            }}
          >
            <h2>{ele.name}</h2>
            <h2>{ele.Degree}</h2>
            <h2>{ele.college}</h2>
          </div>
        );
      })}

      {arr.map((ele, index) => (
        <h2 key={index}>{ele}</h2>
      ))}
    </div>
  );
};

export default List;
