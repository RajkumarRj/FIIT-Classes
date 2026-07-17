import axios from "axios";
import React, { useEffect, useState } from "react";
import { Link, Links } from "react-router-dom";

const Products = () => {
  const [data, setData] = useState([]);

  const fetchData = async () => {
    const result = await axios.get("https://dummyjson.com/products");
    console.log(result.data.products);
    setData(result.data.products);
  };
  useEffect(() => {
    fetchData();
  }, []);
  return (
    <div
      style={{
        display: "flex",
        justifyContent: "center",
        alignItems: "center",
        flexWrap: "wrap",
        gap: "20px",
      }}
    >
      {data.map((ele) => {
        return (
          <Link to={`/product/${ele.id}`}>
            <div
              key={ele.id}
              style={{ border: "2px solid black", padding: "20px" }}
            >
              <p>{ele.title}</p>
              <img
                src={ele.images[0]}
                alt=""
                style={{ width: "100px", height: "100px" }}
              />
           
            </div>
          </Link>
        );
      })}
    </div>
  );
};

export default Products;
