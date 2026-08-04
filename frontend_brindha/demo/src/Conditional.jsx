import React from "react";
import Axios from "./Axios";

const Conditional = () => {
  const isLoggedIn = true;
  const userType = "admin";

  switch (userType) {
    case "admin":
      return <h1>Admin dashboard</h1>;
    case "user":
      return <h1>User dashboard</h1>;
    default:
      return <h1>Welcome to the app</h1>;
  }

  //   if (isLoggedIn) {
  //     return <Axios/>;
  //   } else {
  //     return <h1>Logged out</h1>;
  //   }

  //   return <div>{isLoggedIn ? <h1>Logged IN</h1> : <h1>Logged out</h1>}</div>;

  //   return <div> {isLoggedIn && <h1>Welcome back </h1>}</div>;
};

export default Conditional;
