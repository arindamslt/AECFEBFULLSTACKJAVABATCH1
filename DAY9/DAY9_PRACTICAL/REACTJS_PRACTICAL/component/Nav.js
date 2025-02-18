import React from 'react'
import "./Nav.css"
function Nav() {
  return (
    <div className='navContainer'>
       
      <div className='lftContainer'>
        <h2>MYAPP</h2>
      </div>
      <div className='rtContainer'>
       <a href="/food">FOOD</a>
       <a href="/profile">PROFILE</a>
       <a href="/contact">CONTACTUS</a>
      
       
      </div>
    </div>
  )
}

export default Nav
