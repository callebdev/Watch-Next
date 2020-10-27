package com.example.tvshows.responses;

import com.example.tvshows.models.TVShowDetails;
import com.google.gson.annotations.SerializedName;

public class TVShowDetailsResponse {

    @SerializedName("tvShow")
    private TVShowDetails tvShowDetails; // The model class

    public TVShowDetails getTvShowDetails() {
        return tvShowDetails;
    }
}
