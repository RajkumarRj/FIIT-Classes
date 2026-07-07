import { createContext } from "react";

const Usercontext = createContext();

export const Uerprovider = ({ children }) => {
  let obj = {
    name: "FIIT",
    age: 20,
  };
  return <Usercontext.Provider value={obj}>{children}</Usercontext.Provider>;
};

export default Usercontext;