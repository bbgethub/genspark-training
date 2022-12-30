import React from 'react'
import "./main.css";
class main extends React.Component
{
    
    render()
    {
        return(<div className="main" >
          <MyInfo></MyInfo>  
        </div>)
    }
}
export default main;
function MyInfo(){
       return <div class='myInfo'>
            <h1>Jayabharathi L</h1>
            <p>Hi I'm Jaya, and I graduated Masters in Software Engineering.
            My interests are in Front/Back End Engineering and I love to create 
            beautiful performant products with delightful user experiences.
            I have a good knowledge of Java, SpringBoot, JPA, Spring MVC, MySQL, REact, HTML, CSS and Javascript.
            Along with technical skills, I have good communication skills that I feel are necessary to accomplish daily
            responsibilities effectively. Coming to my other interest, I love travel to visit many places. My favourite
            vacation spots are
            </p>
            <ul>
                <li>Family Vacations in Orlando, Florida</li>
                <li>Anaheim, California</li>
                <li>Oahu and Maui, Hawaii</li>
            </ul>
       </div>; 
}