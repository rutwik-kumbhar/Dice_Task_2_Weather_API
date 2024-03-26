package com.weather.api.services;


public interface WeatherService {

    public Object GetForecastSummaryByLocationName(String location);

    public Object GetWeatherForeCastByLocationAndDay(String location , int day);
}
