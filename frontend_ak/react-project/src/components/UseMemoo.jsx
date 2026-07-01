import React from 'react'
import Memochild from './Memochild'

const useMemoo = () => {
    console.log("usememo df");
    
  return (
    <div>
        <h2>Memo</h2>
      
      <Memochild  content  = "Hello there" />
    </div>
  )
}

export default useMemoo
