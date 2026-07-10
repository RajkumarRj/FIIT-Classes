import React, { useEffect } from 'react'
import { container } from './ControlledComponent';

  const useDocumentTitle = (title) => {
    useEffect(() => {
      document.title = title;
    }, [title]);
  };



const CustomHook = () => {

 useDocumentTitle("Redmi");

  
  return (
    <div style={container}>
        <h1>Custom hoook</h1>
      
    </div>
  )
}

export default CustomHook
