import React, { createContext } from "react";

const UseContext = createContext(); // we created store

export const UserProvider = ({ children }) => {
  const user = {
    name: "FIIT",
    email: "Fiit@gmail.com",
  };
   
  return <UseContext.Provider value={user}>{children}</UseContext.Provider>;
};

export default UseContext;

// step 1: create store
// step 2 : create state amd provider
// step 3 : usecontext we can access the store
