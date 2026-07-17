import React from "react";
import { Link } from "react-router-dom";

const Header = () => {
  return (
    <div>
      <span>
        {" "}
        <Link to={"/"}>Home</Link>{" "}
      </span>
      <span>
        <Link to={"/about"}>About</Link>
      </span>

      <span>
        <Link to={"/product"}>Product</Link>
      </span>
    </div>
  );
};

export default Header;
