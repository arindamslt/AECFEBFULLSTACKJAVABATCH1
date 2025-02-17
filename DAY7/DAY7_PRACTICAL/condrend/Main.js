import React from 'react'
import Login from './Login'
import Register from './Register'
import { useState } from 'react'
function Main() {
    let[state,setState]=useState(true);
  return (
    <div>
      <h2>MAIN COMPONENT</h2>
      {
        state ? <Register/>:<Login/>
      }
    </div>
  )
}

export default Main
