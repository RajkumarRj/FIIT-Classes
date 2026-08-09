import React, { useEffect, useState } from "react";
import axios from "axios";
import { useNavigate } from "react-router-dom";

const Product = () => {
  const [data, setData] = useState([]);

  const fetchData = async () => {
    const result = await axios.get("https://dummyjson.com/products");

    console.log(result.data.products);

    setData(result.data.products);
  };

  useEffect(() => {
    fetchData();
  }, []);

  const navigate = useNavigate();
  return (
    <div>
      <h1>Product page</h1>

      <div className="flex mt-10 gap-2 flex-wrap items-center justify-center w-full">
        {data.slice(0, 5).map((ele) => {
          return (
            <div
              key={ele.id}
              className="border-2  w-[200px] flex flex-col justify-center items-center "
            >
              <h1>{ele.title}</h1>
              <img src={ele.images[0]} alt="" className="w-30  " />
              <p>{ele.price}</p>
              <button onClick={() => navigate(`/products/${ele.id}`)}>
                Click
              </button>
            </div>
          );
        })}
      </div>
    </div>
  );
};

export default Product;
