import React from 'react'
import Child1 from './Child1'

const Child = ({name, course}) => {
  
  return (
    <div>
      <h1>Child - {name}</h1>
      <h2>Child - {course}</h2>

      <Child1 name = {name} course = {course}/>
    </div>
  )
}

export default Child
