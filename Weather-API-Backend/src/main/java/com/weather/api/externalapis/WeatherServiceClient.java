package com.weather.api.externalapis;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(name = "weatherApi" , url = "https://api.weatherapi.com/v1")
public interface WeatherServiceClient {
    @GetMapping("/forecast.json")
    ResponseEntity<Object> getWeatherForecastByLocation(@RequestParam(value = "key" ) String apiKey,
                                                                 @RequestParam("q") String location,
                                                                 @RequestParam(value = "days" ,  required = false , defaultValue = "1") int days);
}
