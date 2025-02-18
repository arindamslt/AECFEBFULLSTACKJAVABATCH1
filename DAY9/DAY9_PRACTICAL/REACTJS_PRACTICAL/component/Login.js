import React from 'react'

function Login() {
  return (
    <div style={{width:"30%",margin:"50px auto"}}>
     <h2 className='text-primary' style={{textDecoration:"underline"}}>LOGIN FORM</h2>
      <input type="text" className='form-control' placeholder='ENTER THE USERNAME'/>
      <input type="password" className='form-control' placeholder='ENTER THE PASSWORD'/>
      <button className='btn btn-outline-primary'>LOGIN</button> &nbsp;&nbsp;
      <button className='btn btn-outline-danger'>REFRESH</button> 
    </div>
  )
}

export default Login
