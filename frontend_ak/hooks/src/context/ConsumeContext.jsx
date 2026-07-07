import React, { useContext } from "react";
import Usercontext from "./Usercontext";

const ConsumeContext = () => {
   
    
  const { name, age } = useContext(Usercontext);
  return (
    <div>
      <h2>
        {name} - {age}
      </h2>
    </div>
  );
};

export default ConsumeContext;
