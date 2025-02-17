//import logo from './logo.svg';
import './App.css';
import FunctionalComp from './components/FunctionalComp';
import StateDemo from './components/state/StateDemo';
import Profile from './components/state/Profile';
import Parent from './components/props/Parent';
//import Parent1 from './components/contextapi/Parent1';
import Parent2 from './components/contextapi/Parent2';
import A from './components/propsdrilling/A';
import "bootstrap/dist/css/bootstrap.css";
import Main from './components/condrend/Main';
import User from './components/axios/User';
import UserInfo from './components/useeffect/UserInfo';
import Nav from './components/router/Nav';
import { Routes,Route } from 'react-router-dom';
import Electronics from './components/router/Electronics';
import Garment from './components/router/Garment';
import Retails from './components/router/Retails';
import Jewellery from './components/router/Jewellery';
import Product from './components/router/Product';
//import ProducrReport from './components/bootreact/ProducrReport';
import ProductReport from './components/bootreact/ProductReport';
import AddProduct from './components/bootreact/AddProduct';
function App() {
  return (
    <div className="App">
     <h2>REACT APP</h2>
      <Nav/>
      
     <Routes>
     <Route path="/state" element={<StateDemo/>}/>
     <Route path="/profile" element={<Profile/>}/>
     <Route path="/props" element={<Parent/>}/>
     <Route path="/pdrilling" element={<A/>}/>
     <Route path="/context" element={<Parent2/>}/>
     <Route path="/axios" element={<User/>}/>
     <Route path="/useeffect" element={<UserInfo/>}/>
     <Route path="/condrend" element={<Main/>}/>
     <Route path="/preport" element={<ProductReport/>}/>
     <Route path="/addproduct" element={<AddProduct/>}/>
     <Route path="/product" element={<Product/>}>
     <Route path="electronics" element={<Electronics/>}/>
     <Route path="garment" element={<Garment/>}/>
     <Route path="retails" element={<Retails/>}/>
     <Route path="jewellery" element={<Jewellery/>}/>
     </Route>
     </Routes>
    </div>
  );
}

export default App;
