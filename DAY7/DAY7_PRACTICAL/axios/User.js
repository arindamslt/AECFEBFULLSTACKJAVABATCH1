import React from 'react'
import axios from 'axios'
import { useState } from 'react'
function User() {
    let[user,setUser]=useState([]);
    let[data,setData]=useState([]);
    const getData=()=>{
        axios.get("https://randomuser.me/api/?results=20")
        .then((res)=>{
            console.log(res.data.results);
            setUser(res.data.results);
            setData(res.data.results);
        })
        .catch((error)=>{
            alert("SOMETHING WENT WRONG FETCHING DATA");
            console.log(error);
        })
    }
    const filterData=(event)=>{
      if(event.target.value==='male')
      {
        setUser(data.filter((element,index)=>{
            return element.gender==='male';
        }))
      }
      else if(event.target.value==='female')
        {
          setUser(data.filter((element,index)=>{
              return element.gender==='female';
          }))
        }
        else{
            setUser(data);
        }
    }
  return (
    <div>
      <h2>USER DETAILS</h2>
      <button className='btn btn-outline-secondary' onClick={getData}>GETDATA</button>
      {
        user.length>0 &&(
            <div>
            <input type="radio" name="gender" value="all" defaultChecked onChange={filterData}/>All
            <input type="radio" name="gender" value="male" onChange={filterData}/>male
            <input type="radio" name="gender" value="female" onChange={filterData}/>female
            </div>
        )
      }
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

export default User
