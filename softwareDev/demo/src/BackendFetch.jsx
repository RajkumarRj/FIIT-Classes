import React from "react";
import axios from "axios";
import { useEffect } from "react";
import { useState } from "react";

const BackendFetch = () => {
  const [data, setData] = useState([]);
  const fetchData = async () => {
    const result = await axios.get("http://localhost:3000/");

    console.log(result.data.user);
    setData(result.data.user);
  };
  useEffect(() => {
    fetchData();
  }, []);
  return (
    <div>
      <h2>Fetch backend</h2>
      {data.map((ele) => {
        return (
          <div>
            <h2>{ele.name}</h2>
          </div>
        );
      })}
    </div>
  );
};

export default BackendFetch;
