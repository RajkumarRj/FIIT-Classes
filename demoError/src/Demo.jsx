import React from 'react'

const Demo = () => {


    const handleClick = ()=>{
        alert("Button clicked");
    }


  return (
    <div>
        <h1>Function call vs Function Reference</h1>
        <button onClick={handleClick}>Click</button>
      
    </div>
  )
}

export default Demo
