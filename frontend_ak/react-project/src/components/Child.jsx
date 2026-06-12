import React from 'react'

const Child = ({result , count}) => {
     

  return (
    <div>
      <h1>{result}</h1>
      <h1>{count}</h1>
      <h2>Child component inside state </h2>
    </div>
  );
}

export default Child
