import React from "react"
import ReactDOM from "react-dom"
import App from "./App.js"

const root = ReactDOM.createRoot(document.getElementById('root'));
const element = <h1>Hello, world</h1>;
root.render(element);

//require('dotenv').config();
//const api_key = process.env.API_KEY;

//fetch("http://api.openweathermap.org/geo/1.0/direct?q={city name},{state code},{country code}&limit=5&appid=${api_key}")

//fetch("https://api.openweathermap.org/data/2.5/weather?lat={lat}&lon={lon}&appid=${api_key}")