import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';

const root = ReactDOM.createRoot(document.getElementById('root'));
const root1 = ReactDOM.createRoot(document.getElementById('root1'));
root.render(
  <React.StrictMode>
    <App />
  </React.StrictMode>
);
const navbar=(<div>
  <h1>My website in React</h1>
  <h3>Reasons I like React</h3>
  <ol>
    <li>It's composable</li>
    <li>It's declarative</li>
    <li>It's a hireable skill</li>
    <li>It's activly maintained by skilled people </li>
    </ol>
    </div>)

root1.render(navbar);


// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
