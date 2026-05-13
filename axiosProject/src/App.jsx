import { useEffect, useState } from "react";
import reactLogo from "./assets/react.svg";
import viteLogo from "./assets/vite.svg";
import heroImg from "./assets/hero.png";
import "./App.css";
import axios from "axios";
import api from "./api";

function App() {
  const [data, setData] = useState([]);

  const fetchData = async () => {
    const result = await api.get("/products");
    console.log(result.data);

    setData(result.data);
    // await fetch("https://jsonplaceholder.typicode.com/users")
    //   .then((res) => res.json())
    //   .then((ele) => setData(ele));
  };

  useEffect(() => {
    fetchData();
  }, []);

  console.log(data);
  const styled ={
    border:"2px solid black",
    margin:"20px",
    padding:"20px",

  }

  const imageStyled={
    width:"200px",
    height:"200px"
  }

  return (
    <>
      <div>
        <h1>Axios</h1>
      </div>

      {data.map((ele) => (
        <div key={ele.id} style={styled}>
          {/* <h2>{ele.name}</h2>
          <h3>{ele.company.name}</h3>
          <h3>{ele.address.geo.lat}</h3> */}
          <h2>{ele.title}</h2>
          <img src={ele.image} alt="" style={imageStyled} />
          <p>{ele.price}</p>
          <p>{ele.description}</p>
          {/* <h2>{ele.title}</h2>
          <img src={ele.url} alt="" /> */}
        </div>
      ))}
    </>
  );
}

export default App;
