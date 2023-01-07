import React from 'react'
import { useState } from 'react'
import { sculptureList } from './data.js'

export const Demo = () => {
    const [index,setindex]=useState(0);
    function click_handle()
    {
        setindex(index+1);
    }
    function click_prev()
    {
      setindex(index-1);
    }
    function click_reset()
    {
      setindex(0);
    }
    let sculp=sculptureList[index];
  return (
   <>
   <button onClick={click_prev}>Prev</button>
   <button onClick={click_handle}>Next</button>
   <button onClick={click_reset}>Reset</button>
   <h2><i>{sculp.name}</i>
   by {sculp.artist}
   </h2>
   <h3>
    ({index+1} of {sculptureList.length})
   </h3>
   <img 
    src={sculp.url}
    alt={sculp.alt}
    ></img>
    <p>
      {sculp.description}
    </p>
   </>
  )
}
export default Demo;