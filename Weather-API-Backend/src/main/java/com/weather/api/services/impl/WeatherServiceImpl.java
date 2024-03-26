package com.weather.api.services.impl;


import com.weather.api.exceptions.InvalidRequestException;
import com.weather.api.externalapis.RapidApiClient;
import com.weather.api.externalapis.RapidApiClientHeader;
import com.weather.api.externalapis.WeatherServiceClient;
import com.weather.api.externalapis.WeatherServiceClientResources;
import com.weather.api.services.WeatherService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class WeatherServiceImpl implements WeatherService {

    private final RapidApiClient rapidApiClient;
    private final WeatherServiceClient weatherServiceClient;

    @Override
    public Object GetForecastSummaryByLocationName(String location) {
          try {
            return    rapidApiClient.GetForecastSummaryByLocationName(location, RapidApiClientHeader.apiKey,RapidApiClientHeader.apiHost).getBody();
          }catch (RuntimeException ex){
              throw  new InvalidRequestException("Invalid Request");
          }

    }

    @Override
    public Object GetWeatherForeCastByLocationAndDay(String location, int day) {
        try {
            return weatherServiceClient.getWeatherForecastByLocation(WeatherServiceClientResources.key,location,day).getBody();
        }catch (RuntimeException ex){
            throw  new InvalidRequestException("Invalid Request");
        }


    }


}

