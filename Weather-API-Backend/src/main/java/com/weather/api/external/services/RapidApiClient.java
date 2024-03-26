package com.weather.api.external.services;



import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "rapidApi" , url = "https://forecast9.p.rapidapi.com")
public interface RapidApiClient {

    @GetMapping("/rapidapi/forecast/{location}/summary/")
    ResponseEntity<Object> GetForecastSummaryByLocationName(@PathVariable String location,
                                                                            @RequestHeader("X-RapidAPI-Key") String apiKey,
                                                                            @RequestHeader("X-RapidAPI-Host") String apiHost);


}
