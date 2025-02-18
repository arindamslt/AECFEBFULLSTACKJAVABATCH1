import React from 'react'

function Register() {
  return (
    <div style={{width:"30%",margin:"50px auto"}}>
      <h2 className='text-white bg-dark'>REGISTRATION FORM</h2>
      <input type="text" className='form-control' placeholder='ENTER THE USERNAME'/>
      <input type="password" className='form-control' placeholder='ENTER THE PASSWORD'/>
      <input type="text" className='form-control' placeholder='ENTER THE NAME'/>
      <input type="text" className='form-control' placeholder='ENTER THE PHONE NUMBER'/>
      <input type="text" className='form-control' placeholder='ENTER THE EMAIL'/>
      <button className='btn btn-outline-secondary'>REGISTER</button> &nbsp;&nbsp;
      <button className='btn btn-outline-danger'>REFRESH</button>
    </div>
  )
}

export default Register
