package com.example.tvshows.models;

import androidx.annotation.Keep;

import com.google.gson.annotations.SerializedName;

import java.util.List;

@Keep
public class TVShowDetails {

//    @SerializedName("id")
//    private int id;
//
//    @SerializedName("name")
//    private String name;
//
//    @SerializedName("permalink")
//    private String permalink;

    @SerializedName("url")
    private String url;

    @SerializedName("description")
    private String description;

//    @SerializedName("description_source")
//    private String descriptionSource;
//
//    @SerializedName("start_date")
//    private String startDate;
//
//    @SerializedName("end_date")
//    private String endDate;
//
//    @SerializedName("country")
//    private String country;
//
//    @SerializedName("status")
//    private String status;

    @SerializedName("runtime")
    private String runtime;

//    @SerializedName("network")
//    private String network;
//
//    @SerializedName("youtube_link")
//    private String youtubeLink;

    @SerializedName("image_path")
    private String imagePath;

//    @SerializedName("image_thumbnail_path")
//    private String imageThumbnailPath;

    @SerializedName("rating")
    private String rating;

//    @SerializedName("rating_count")
//    private String ratingCount;
//
//    @SerializedName("countdown")
//    private String countdown;

    @SerializedName("genres")
    private String[] genres;

    @SerializedName("pictures")
    private String[] pictures;

    @SerializedName("episodes")
    private List<Episode> episodes;

    public String getUrl() {
        return url;
    }

    public String getDescription() {
        return description;
    }

    public String getRuntime() {
        return runtime;
    }

    public String getImagePath() {
        return imagePath;
    }

    public String getRating() {
        return rating;
    }

    public String[] getGenres() {
        return genres;
    }

    public String[] getPictures() {
        return pictures;
    }

    public List<Episode> getEpisodes() {
        return episodes;
    }
}
