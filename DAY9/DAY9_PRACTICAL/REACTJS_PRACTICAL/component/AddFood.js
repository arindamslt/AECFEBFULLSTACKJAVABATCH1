import React from 'react'
import axios from 'axios'
import { useState } from 'react'
function AddFood() {
    let[food,setFood]=useState({
        fid:"",
        fname:"",
        price:""
    })
    let[msg,setMsg]=useState("");
    const addData=()=>{
        axios.post("http://localhost:1005/food/add",food)
        .then((res)=>{
            console.log(res.data);
            setMsg(res.data);
        })
        .catch((error)=>{
            console.log(error);
            alert("SOMETHING WENT WRONG ADD DATA");
        })
    }
    const refreshData=()=>{
      setMsg("");
      setFood({
        fid:"",
        fname:"",
        price:""
      })
    }   
  return (
    <div style={{width:"30%",margin:"50px auto"}}>
      <h2 className='text-primary'>ADDING FOOD</h2>
      <input className='form-control' type="text" placeholder='ENTER THE FOOD ID' 
      value={food.fid} 
      onChange={(event)=>{
        setFood({
            ...food,
            fid:event.target.value

        })
      }}/>
      <input className='form-control' type="text" placeholder='ENTER THE FOOD NAME' 
      value={food.fname} 
      onChange={(event)=>{
        setFood({
            ...food,
            fname:event.target.value

        })
      }}/>
      <input className='form-control' type="text" placeholder='ENTER THE FOOD PRICE' 
      value={food.price} 
      onChange={(event)=>{
        setFood({
            ...food,
            price:event.target.value

        })
      }}/>
   
      <button className='btn btn-outline-primary' onClick={addData}>ADD</button> &nbsp;&nbsp;
      <button className='btn btn-outline-secondary' onClick={refreshData}>REFRESH</button>
       <h3 className='text-warning'>{msg}</h3>
    </div>
  )
}

export default AddFood