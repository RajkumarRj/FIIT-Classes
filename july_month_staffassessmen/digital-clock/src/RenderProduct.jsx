import React from "react";
import axios from "axios";
import { useState } from "react";
import { useEffect } from "react";

const containers = {
  display: "flex",
  flexWrap:"wrap",
  gap:"20px",
  justifyContent:"center",
 
};
const RenderProduct = () => {
  const [data, setData] = useState([]);

  const fetchData = async () => {
    const response = await axios.get("https://dummyjson.com/products");
    // const result = await
    setData(response.data.products);
    console.log(response.data.products);
  };

  useEffect(() => {
    fetchData();
  }, []);
  return (
    <div>
      <h2 style={{textAlign:"center"}}>Rendered product</h2>

      <div style={containers}>
        {data.map((ele) => {
          return (
            <div key={ele.id} style={{boxShadow:"0 0 10px #333", border:"2px solid black",padding:"20px", width:"300px" ,display:"flex", flexDirection:"column", justifyContent:"center", alignItems:"center"}}>
              <h2>{ele.title}</h2>
              <img src={ele.images[0]} alt={ele.title} style={{width:"200px", height:"200px"}} />
                <p>Price: {ele.price}</p>
            </div>
          );
        })}
      </div>
    </div>
  );
};

export default RenderProduct;
