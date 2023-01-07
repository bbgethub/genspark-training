import React from "react";
import './style.css';

export default function Header()
{
    return(
        <header className="header"> 
            <img className="header--img" src="logo192.png" />
        <h2 className="header--title">Meme Generator</h2>
        <h3 className="header--project">React Course -Project3</h3>
        </header>
 
    )
}
