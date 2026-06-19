import React, { useEffect, useState } from "react";


const container = {
    backgroundColor:"yellow",
    margin:"10px"
}

const Usehooooks = () => {
  const [count, setCount] = useState([]);

  useEffect(() => {
    fetch("https://jsonplaceholder.typicode.com/posts")
      .then((res) => res.json())
      .then((data) => setCount(data));
  }, []);

  return (
    <div>
      <h1>Use Effect</h1>
      {/* <h1>{count}</h1> */}

      {
        count.map((ele)=>{
            return <div key={ele.id}  style={container}>
                <h2>{ele.title}</h2>
            </div>
        })
      }
      <button onClick={() => setCount(count + 1)}>Increment</button>
    </div>
  );
};

export default Usehooooks;
