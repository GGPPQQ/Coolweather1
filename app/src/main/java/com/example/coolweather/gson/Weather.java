package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by ASUS on 2018/1/3.
 */

public class Weather {
    public  String status;

    public  Basic basic;

    public AQI aqi;

    public  Now now;

    public  Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastsList;
}
