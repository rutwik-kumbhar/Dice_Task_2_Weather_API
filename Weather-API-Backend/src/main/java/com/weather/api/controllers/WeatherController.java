package com.weather.api.controllers;


import com.weather.api.services.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/v1/weather/")
public class WeatherController {


    @Autowired
    private WeatherService weatherService;

    @GetMapping("/rapid/{location}")
    public ResponseEntity<?> getForecastSummary(@PathVariable  String location){
        return  new ResponseEntity<Object>(weatherService.GetForecastSummaryByLocationName(location), HttpStatus.OK);
    }

    @GetMapping("/{location}")
    public ResponseEntity<?> getForecastS(@PathVariable  String location, @RequestParam(required = false , defaultValue = "1")  int day){
        return  new ResponseEntity<>(weatherService.GetWeatherForeCastByLocationAndDay(location,day), HttpStatus.OK);
    }
}
