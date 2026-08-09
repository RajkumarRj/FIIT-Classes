import axios from "axios";
import React, { useEffect, useState } from "react";
import { useParams } from "react-router-dom";

const SinglePage = () => {
  const [data, setData] = useState({});

  const { id } = useParams();

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
      <h1>{id}</h1>
      <h1>Single page</h1>

      <div
        key={data.id}
        className="border-2  w-[200px] flex flex-col justify-center items-center "
      >
        <h1>{data.title}</h1>
        <img src={data.images} alt="" className="w-30  " />
        <p>{data.price}</p>
      </div>
    </div>
  );
};

export default SinglePage;
