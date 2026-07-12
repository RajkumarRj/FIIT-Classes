
import { useState } from 'react';
import './App.css'
import Component from './Component'

function App() {

  const[count, setCount] = useState(10);

  const handleClick = ()=>{

    setCount(count + 1);
    // count+1;
  }

  return (
    <>
    <h1> {count} </h1>
    <button onClick={handleClick}>Count++</button>
    <h2>Hello there</h2>

      {/* <Component />
      <Component />
      <Component />
      <Component />
      <Component /> */}

      {/* jsx  */}
    </>
  );
}

export default App
