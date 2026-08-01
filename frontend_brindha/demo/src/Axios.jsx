import axios from "axios";
import React, { useEffect, useState } from "react";
import { api } from "./api";

const Axios = () => {
  const [data, setData] = useState([]);
  const fetchData = async () => {
    const result = await axios.get("https://dummyjson.com/products");

    console.log(result.data.products);

    setData(result.data.products);
  };

  const fetchUsers = async () => {
    const result = await api.delete("/users/1");

    console.log(result);
  };

  useEffect(() => {
    fetchData();
    fetchUsers();
  }, []);

  return (
    <div>
      <h1>Axios</h1>

      {/* {data.map((ele) => {
        return (
          <div
            key={ele.id}
            style={{ border: "2px solid yellow", padding: "10px" }}
          >
            <h1>{ele.title}</h1>
            <img src={ele.images[0]} alt="" />
          </div>
        );
      })} */}
    </div>
  );
};

export default Axios;
