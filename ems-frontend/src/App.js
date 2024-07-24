import './App.css';
import {BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import EmployeeListComponent from './componenets/EmployeeListComponent';
import FooterComponent from './componenets/FooterComponent';
import HeaderComponent from './componenets/HeaderComponent';
import AddEmployeeComponent from './componenets/AddEmployeeComponent';

function App() {
  return (

    <div>
      <Router>
      <HeaderComponent/>
      <div className= "container">
        <Routes>
            <Route exact path="/" element={<EmployeeListComponent />} />
            <Route path="/employees" element={<EmployeeListComponent />} />
            <Route path="/add-employee" element={<AddEmployeeComponent />} />
            <Route path="/edit-employee/:id" element={<AddEmployeeComponent/>} />
        </Routes>

      </div>
      {/* <FooterComponent/> */}

      </Router>
    
    </div>
  );
}

export default App;
