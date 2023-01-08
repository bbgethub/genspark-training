import React from "react";
import './style.css';
import memesData from "../memesData";

export default function Meme()
{
    const [meme,setMeme]=React.useState({
        topText:"",
        bottomText:"",
        randomImage:"http://i.imgflip.com/1bij.jpg"
    })

    const [allMemeImages, setAllMemeImages]=React.useState(memesData)

    function getMemeImage()
    {
        const memesArray=allMemeImages.data.memes
        const randomNumber = Math.floor(Math.random() * memesArray.length)
        const url=memesArray[randomNumber].url
        setMeme(prevMeme => ({
            ...prevMeme,
            randomImage: url
        }))
    }
    return(
        <main className="main-class">
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
            <img src={meme.randomImage} className="meme--image" />
        </main>
 
    )
}
