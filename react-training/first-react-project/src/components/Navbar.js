import React from "react";
import "./css/Navbar.css";
const Navbar=() =>
{
        return(
            <div className="navbar">
                <a href="/" className="logo">Fullyword web tutorials</a>
                <ul>
                    <li className="active"><a href="#home">Home</a></li>
                    <li><a href="#services">Services</a></li>
                    <li><a href="#about">About us</a></li>
                    <li><a href="#porfolio">Porfolio</a></li>
                    <li><a href="#contact">Contact us</a></li>
                </ul>
            </div>
  
        );
}
export default Navbar;