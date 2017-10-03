package com.coolweather.android.gson;

/**
 * Created by sun on 2017/10/3.
 */
public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
