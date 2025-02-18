//import logo from './logo.svg';
import './App.css';
import Nav from './component/Nav';
import { Route,Routes } from 'react-router-dom';
import Food from './component/Food';
import AddFood from './component/AddFood';
import DelFood from './component/DelFood';
import Updfood from './component/Updfood';
import SearchFood from './component/SearchFood';
import FoodList from './component/FoodList';
import "bootstrap/dist/css/bootstrap.css";
import Register from './component/Register';
import Login from './component/Login';
import Home from './component/Home';
function App() {
  return (
    <div className="App">
      <h2>FOOD APP</h2>
     <Nav/>
     
      <Routes>
     <Route  path="/" element={<Home/>}/>
     <Route path="/food" element={<Food/>}>
     <Route path="addfood" element={<AddFood/>}/>
     <Route path="delfood" element={<DelFood/>}/>
     <Route path="updfood" element={<Updfood/>}/>
     <Route path="sfood" element={<SearchFood/>}/>
     <Route path="flist" element={<FoodList/>}/>
     </Route>
     </Routes>
    </div>
  );
}

export default App;
