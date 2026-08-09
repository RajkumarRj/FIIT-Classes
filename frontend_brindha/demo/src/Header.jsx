import React from "react";
import { Link, useNavigate } from "react-router-dom";

const Header = () => {
   const navigate = useNavigate();
  return (
    <div>
      <button onClick={() => navigate("/")}> Back to home </button>

      <Link to={"/"}>Home</Link>
      <Link to={"/about"}>About</Link>
      <Link to={"/product"}>Product</Link>
    </div>
  );
};

export default Header;
