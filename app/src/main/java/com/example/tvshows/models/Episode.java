package com.example.tvshows.models;

import androidx.annotation.Keep;

import com.google.gson.annotations.SerializedName;

@Keep
public class Episode {

    @SerializedName("season")
    private String season;

    @SerializedName("episode")
    private String episode;

    @SerializedName("name")
    private String name;

    @SerializedName("air_date")
    private String airDate;

    public String getSeason() {
        return season;
    }

    public String getEpisode() {
        return episode;
    }

    public String getName() {
        return name;
    }

    public String getAirDate() {
        return airDate;
    }
}