import { StrictMode } from "react";
import { createRoot } from "react-dom/client";
import "./index.css";
import App from "./App.jsx";
import { UserProvider } from "./UseContext.jsx";
import { Provider } from "react-redux";
import { Store } from "./store/Store.jsx";

createRoot(document.getElementById("root")).render(
  // <StrictMode>

  <Provider store={Store}>
    <UserProvider>
      <App />
    </UserProvider>
    ,
  </Provider>,

  // </StrictMode>,
);
