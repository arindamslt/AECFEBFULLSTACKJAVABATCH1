import React from 'react'
import axios from 'axios'
import { useState } from 'react'
function SearchFood() {
    let[food,setFood]=useState({
        fid:"",
        fname:"",
        price:""
    })
    let[data,seData]=useState({
      fid:"",
        fname:"",
        price:""
    });
    const searchData=(fid)=>{
      alert(fid);
        axios.get(`http://localhost:1005/food/fetch/${fid}`)
        .then((res)=>{
            console.log(res.data);
            seData(res.data);
        })
        .catch((error)=>{
            console.log(error);
            alert("SOMETHING WENT WRONG ADD DATA");
        })
    }
    
  return (
    <div style={{width:"30%",margin:"50px auto"}}>
      <h2 className='text-primary'>SEARCH FOOD</h2>
      <input className='form-control' type="text" placeholder='ENTER THE FOOD ID' 
      value={food.fid} 
      onChange={(event)=>{
        setFood({
            ...food,
            fid:event.target.value

        })
      }}/>
     
   
      <button className='btn btn-outline-primary' onClick={()=>{
        searchData(food.fid);
      }}>SEARCH</button> &nbsp;&nbsp;
     <table className='table table-hover table-bordered'>
      <thead className='table-dark'>
        <tr>
          <td>FID</td>
          <td>FNAME</td>
          <td>PRICE</td>
        </tr>
      </thead>
      <tbody>
        <tr>
          <td>{data.fid}</td>
          <td>{data.fname}</td>
          <td>{data.price}</td>
        </tr>
      </tbody>
     </table>
      
    </div>
  )
}

export default SearchFood