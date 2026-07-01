import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from './assets/vite.svg'
import heroImg from './assets/hero.png'
import './App.css'
import Usememoo from './Usememoo'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <h2>React</h2>
      <Usememoo/>
    </>
  )
}

export default App
