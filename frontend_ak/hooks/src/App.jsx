import Usememoo from "./Usememoo";
import ConsumeContext from "./context/ConsumeContext";
import { Uerprovider } from "./context/Usercontext";
import CustomHook from "./CustomHook";
import ControlledComponent from "./ControlledComponent";
import AxiosComponent from "./axios/AxiosComponent";
import Conditional from "./Conditional";
import { BrowserRouter, Link, Route, Routes } from "react-router-dom";
import Home from "./pages/Home";
import About from "./pages/About";
import Header from "./pages/Header";
import Products from "./pages/Products";
import ProductPage from "./pages/ProductPage";

function App() {
  return (
    <>
      <h2>Header</h2>
      <Header />

      {/* <Usememoo/> */}
      {/* <ConsumeContext/> */}
      {/* <CustomHook/> */}
      {/* <ControlledComponent/> */}
      {/* <AxiosComponent/> */}
      {/* <Conditional/> */}

      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/about" element={<About />} />
        <Route path="/product" element={<Products />} />
        <Route path="/product/:id" element={<ProductPage />} />
      </Routes>

      <h2>Footer</h2>
    </>
  );
}

export default App;
