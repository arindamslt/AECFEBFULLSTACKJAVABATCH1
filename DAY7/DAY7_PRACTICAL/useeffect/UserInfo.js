import React from 'react'
import axios from 'axios'
import { useState } from 'react'
import { useEffect } from 'react'
function UserInfo() {
      let[user,setUser]=useState([]);
      useEffect(()=>{
        axios.get("https://randomuser.me/api/?results=20")
        .then((res)=>{
            console.log(res.data.results);
            setUser(res.data.results);
           
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
                <td>ID</td>
                <td>NAME</td>
                <td>IMAGE</td>
                <td>GENDER</td>
                <td>EMAIL</td>
                <td>CITY</td>
                </tr>
            </thead>
            <tbody>
                {
                    user.map((element,index)=>{
                        return(
                            <tr>
                            <td>{index+1}</td>
                            <td>{element.name.first}</td>
                            <td><img src={element.picture.medium} height={80} width={80} alt="NO IMAGE"/></td>
                            <td>{element.gender}</td>
                            <td>{element.email}</td>
                            <td>{element.location.city}</td>
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

export default UserInfo
