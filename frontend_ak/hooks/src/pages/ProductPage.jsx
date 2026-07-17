import axios from "axios";
import React, { useEffect, useState } from "react";
import { useParams } from "react-router-dom";

const ProductPage = () => {
  const { id } = useParams();
  console.log(id);

  const [data, setData] = useState({});
  const fetchData = async () => {
    const result = await axios.get(`https://dummyjson.com/products/${id}`);

    console.log(result.data);
    setData(result.data);
  };

  useEffect(() => {
    fetchData();
  }, []);

  return (
    <div>
      <h2>Product page</h2>
      <div>
        <h1>{data.title}</h1>
        <img
          src={data.images}
          style={{ width: "100px", height: "100px" }}
          alt=""
        />
        <p>{data.description}</p>
      </div>
    </div>
  );
};

export default ProductPage;
