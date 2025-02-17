import React from 'react'
import Child1 from './Child1'
import { useState } from 'react'
import mycontext from './context';
function Parent2() {
    let[state,setState]=useState("");
    const populateValue=(event)=>{
        setState(event.target.value);
    }
  return (
    <div>
      <h2>PARENT COMPONENT</h2>
      <input type="text" placeholder='ENTER THE NAME' onChange={populateValue}></input>
      <mycontext.Provider value={state}>
      <Child1/>
      </mycontext.Provider>
    </div>
  )
}

export default Parent2
