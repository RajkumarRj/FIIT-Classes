import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import './index.css'
import App from './App.jsx'
import { Uerprovider } from './context/Usercontext.jsx'
import "bootstrap/dist/css/bootstrap.min.css";
createRoot(document.getElementById('root')).render(
  // <StrictMode>
    <Uerprovider>

    <App />
    
    </Uerprovider>
  // </StrictMode>,
)
