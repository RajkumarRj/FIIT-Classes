import React, { useRef } from 'react'

const Hooks = () => {
    const inputref = useRef();


    const focusInput = ()=>{
        inputref.current.focus();
    }
  return (
    <div>

      <input type="text" ref={inputref} />


      <button onClick={()=> focusInput()}>Focus</button>
    </div>
  )
}

export default Hooks
