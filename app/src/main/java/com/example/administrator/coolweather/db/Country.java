package com.example.administrator.coolweather.db;

import org.litepal.crud.DataSupport;



/**
 * Created by Administrator on 2017/7/3.
 */

public class Country extends DataSupport {
    private int id;
    private int cityId;
    private String weather;
    private String countryName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}
