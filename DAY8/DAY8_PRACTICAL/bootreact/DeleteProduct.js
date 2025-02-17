import React from 'react'
import axios from 'axios'
import { useState } from 'react'
function DeleteProduct() {
    let[product,setProduct]=useState({
        pid:"",
        pname:"",
        pqty:"",
        price:""
    })
    let[msg,setMsg]=useState("");
    const deleteData=(pid)=>{
        alert(pid);
        axios.post(`http://localhost:1005/product/del/${pid}`)
        .then((res)=>{
            console.log(res.data);
            setMsg(res.data);
        })
        .catch((error)=>{
            console.log(error);
            alert("SOMETHING WENT WRONG ADD DATA");
        })
    }   
  return (
    <div style={{width:"30%",margin:"50px auto"}}>
      <h2 className='text-primary'>DELETING PRODUCT</h2>
      <input className='form-control' type="text" placeholder='ENTER THE PRODUCT ID' 
      value={product.pid} 
      onChange={(event)=>{
        setProduct({
            ...product,
            pid:event.target.value

        })
      }}/>
     
      <button className='btn btn-outline-primary' 
      onClick={()=>{
        deleteData(product.pid)
      }}>ADD</button> &nbsp;&nbsp;
      <button className='btn btn-outline-secondary'>REFRESH</button>
       <h3 className='text-warning'>{msg}</h3>
    </div>
  )
}

export default DeleteProduct
