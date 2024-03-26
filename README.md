# Dice_Task_2_Weather_API

## Project Presention [Video](https://drive.google.com/file/d/14cgYyxBzHAS_O1RqzXNCg-gGYFHguIuJ/view?usp=sharing):

## Description
The project involves developing a Spring Boot server in Java and integrating the Weather API from Rapid API. It will expose two RESTful APIs for retrieving weather forecast summaries and hourly details of any city, with header-based authentication using randomly generated keys.

## Key Features:

1. **Secure Authentication:** Header-based authentication.
2. **Rapid API Integration:**  Seamless integration with Rapid API for accurate weather data.
3. **RESTful Endpoint:** Expose endpoints for summary and hourly weather forecasts.
4. **JSON Respons:* Deliver weather forecast information in JSON format for easy consumption.

## Tech-Stacks:
    - Frontend: JavaScript , React , Chakra UI
    - Backend: Java, Spring-Boot, Feign Client

## Prerequisites
- Node JS
- npm or yarn
- Java 8 or higher
- MySQL Workbench (Database)
  
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

## Postman API [Documention](https://bold-comet-967671.postman.co/workspace/2b9819d1-5f1d-4df2-8ceb-19198fc8a5ee/documentation/24834453-ff7e90a2-9481-465a-a21a-5c9db56dda46)

## Postman API [JSON](https://github.com/rutwik-kumbhar/IntentBI-Assignment-1/blob/main/Intentbi-Assignment-1.postman_collection.json)

## Frontend Setup Follow Following Step  
 - Clone Github Respsotory  - Git Clone https://github.com/rutwik-kumbhar/IntentBI-Assignment-1.git
 - Go to Inside Project folder - cd assignment1-frontend
 - Run command - npm install 
 - Run Project - yarn run dev
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
│   ├── api/
│   ├── assets/
│   ├── pages/
│
│   ├── App.jsx
│   └── index.css 
    └── main.jsx
├── .gitignore
├── package.json
├── vite.config.js
└── README.md
</pre>



## Dashboard (Frontend)
<img src="https://github.com/rutwik-kumbhar/IntentBI-Assignment-1/blob/main/Dashboard.png" alt="Alt Text" width="700"/>
