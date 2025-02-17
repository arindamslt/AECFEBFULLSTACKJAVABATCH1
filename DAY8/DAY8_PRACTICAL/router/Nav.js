import React from 'react'
import "./Nav.css"
function Nav() {
  return (
    <div className='navContainer'>
       
      <div className='lftContainer'>
        <h2>MYAPP</h2>
      </div>
      <div className='rtContainer'>
       <a href="/state">STATE</a>
       <a href="/profile">PROFILE</a>
       <a href="/props">PROPS</a>
       <a href="/pdrilling">PROPSDRILLING</a>
       <a href="/context">CONTEXT</a>
       <a href="/axios">AXIOS</a>
       <a href="/useeffect">USEEFFECT</a>
       <a href="/condrend">CONDRENDERING</a>
       <a href="/preport">PRODUCTREPORT</a>
       <a href="/addproduct">ADDPRODUCT</a>
       <a href="/product">PRODUCT</a>
      </div>
    </div>
  )
}

export default Nav
