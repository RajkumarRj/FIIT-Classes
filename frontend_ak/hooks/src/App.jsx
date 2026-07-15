import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from './assets/vite.svg'
import heroImg from './assets/hero.png'
import './App.css'
import Usememoo from './Usememoo'
import ConsumeContext from './context/ConsumeContext'
import { Uerprovider } from './context/Usercontext'
import CustomHook from './CustomHook'
import ControlledComponent from './ControlledComponent'
import AxiosComponent from './axios/AxiosComponent'
import Conditional from './Conditional'


function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <h2>React</h2>
      {/* <Usememoo/> */}
      {/* <ConsumeContext/> */}
      {/* <CustomHook/> */}
      {/* <ControlledComponent/> */}
      {/* <AxiosComponent/> */}
      <Conditional/>
    </>
  )
}

export default App
