import React from "react";
import './style.css';
import memesData from "./memesData.js"

let url
function getMemeImage()
{
    const memesArray=memesData.data.memes
    const randomArray=Math.floor(Math.random()*memesArray.length)
    url=memesArray[randomArray].url
    console.log(url)
}
export default function Meme()
{
    return(
        <main>
            <p>{url}</p>
            <div className="form">
            <input 
            type="text" 
            className="form--inputs"
            placeholder="Top text" />
           <input 
           type="text" 
           className="form--inputs"
           placeholder="Bottom text"
           />
            <button
             className="form--button"
             onClick={getMemeImage}> Get a new meme image 🖼</button>
            </div> 
        </main>
 
    )
}
