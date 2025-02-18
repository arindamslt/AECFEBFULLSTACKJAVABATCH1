import React from 'react'
import axios from 'axios'
import { useState } from 'react'
import { useEffect } from 'react'
function FoodList() {
      let[user,setUser]=useState([]);
      useEffect(()=>{
        axios.get("http://localhost:1005/food/fetch")
        .then((res)=>{
            console.log(res.data);
            setUser(res.data);
           
        })
        .catch((error)=>{
            alert("SOMETHING WENT WRONG FETCHING DATA");
            console.log(error);
        })
      },[])
  return (
    <div>
      {
         user.length>0 ? 
         <div style={{width:"30%",margin:"50px auto"}}>
          <table className='table table-hover table-striped'>
            <thead className='table-dark'>
                <tr>
                <td>FOOD ID</td>
                <td>FOOD NAME</td>
                <td>PRICE</td>
                
                </tr>
            </thead>
            <tbody>
                {
                    user.map((element,index)=>{
                        return(
                            <tr>
                            <td>{element.fid}</td>
                            <td>{element.fname}</td>
                            <td>{element.price}</td>
                           
                            </tr>
                        )
                    })
                }
            </tbody>
          </table>

         </div>
         :<h2 style={{color:"red"}}>NO DATA FOUND</h2>
      }
    </div>
  )
}

export default FoodList