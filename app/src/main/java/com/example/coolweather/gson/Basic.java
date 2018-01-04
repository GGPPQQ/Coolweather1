package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ASUS on 2018/1/3.
 */

public class Basic {
    @SerializedName("city")
    public  String cityname;

    @SerializedName("id")
    public  String weatherId;

    public  Update update;

    public  class Update{
        @SerializedName("loc")
        public  String updataTime;
    }
}
