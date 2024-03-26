# Dice_Task_2_Weather_API

## Project Presention  [Video](https://drive.google.com/file/d/1kQlocLDAhK4KOCpogZwGWkNnVXQhgBbY/view?usp=sharing):

## Description
The project involves developing a Spring Boot server in Java and integrating the Weather API from Rapid API. It will expose two RESTful APIs for retrieving weather forecast summaries and hourly details of any city, with header-based authentication using randomly generated keys.

## Key Features:

1. **Secure Authentication:** Header-based authentication.
2. **Rapid API Integration:**  Seamless integration with Rapid API for accurate weather data.
3. **RESTful Endpoint:** Expose endpoints for summary and hourly weather forecasts.
4. **JSON Respons:** Deliver weather forecast information in JSON format for easy consumption.

## Tech-Stacks:
    - Frontend: JavaScript , React , Chakra UI
    - Backend: Java, Spring-Boot, Feign Client

## Prerequisites
- Node JS
- npm or yarn
- Java 8 or higher

  
## Backend Setup 
### Dependency:
    - spring-boot-starter-web
    - spring-cloud-starter-openfeign
    - lombok

##### Run the Spring Boot Application


## Backend Directory Structure
<pre> 
Weather-Api-1-backend/ 
   ├─ src/
       ├─ com.parking/ 
          ├─ controllers
          ├─ exceptions
          ├─ externalapis
          ├─ service (interface) 
                    ├─ impl (implemented classes)
          ├─ repositories
          ├─ service
      ├─ WeatherApiApplication
</pre>

## Postman API Collection [JSON](https://github.com/rutwik-kumbhar/Dice_Task_2_Weather_API/blob/main/Dice-Weather-Services.postman_collection.json)

## Backend Deployment Plarform
    https://railway.app/

## Backend Deployment URL
     https://dice-weather-backend-production.up.railway.app/

## Backend API End Point 

    -Forecast Summary By Location Name
       - Method @GetMappinng 
       - End Point --> https://dice-weather-backend-production.up.railway.app/api/v1/weather/rapid/berlin
       
    -Hourly Forecast By Location Name
       - Method @GetMappinng 
       - End Point --> https://dice-weather-backend-production.up.railway.app/api/v1/weather/berlin
    

## Frontend Setup Follow Following Step  
 - Clone Github Respsotory  - Git Clone https://github.com/rutwik-kumbhar/Dice_Task_2_Weather_API
 - Go to Inside Project folder - cd weather-app-frontend
 - Run command - npm install 
 - Run Project - npm run dev
 - open give url -  http://127.0.0.1:5173/

## Frontend Directory Structure
<pre> 
Assignment-1-backend/ 
my-react-app/
│
├── public/
│   ├── index.html
│   └── favicon.ico
│
├── src/
│   ├── components/
│   
│   ├── App.jsx
│   └── index.css 
    └── main.jsx
├── .gitignore
├── package.json
├── vite.config.js
└── README.md
</pre>

## Frontend Deployment Plarform
     https://www.netlify.com/

## Frontend Deployment URL
     https://weather-dice.netlify.app/
    
## Dashboard (Frontend)
<img src="https://github.com/rutwik-kumbhar/Dice_Task_2_Weather_API/blob/main/weather-app.png" alt="Alt Text" width="700"/>
