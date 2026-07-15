import React from "react";

const Conditional = () => {
  const isLoggedIn = true;

  // ternary
  return (
    <div>  {isLoggedIn && <h2>Logical rendering</h2>} 

         {isLoggedIn ? <h1>Welcome back</h1> : <h1>Please log in</h1>} </div>
  );
  //   if(isLoggedIn){
  //     return <h1>Welcome back</h1>
  //   }else{
  //     return <h1>Please log in</h1>
  //   }
};

export default Conditional;
