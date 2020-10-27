package com.example.tvshows.network;

import com.example.tvshows.models.TVShow;
import com.example.tvshows.responses.TVShowDetailsResponse;
import com.example.tvshows.responses.TVShowsResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {

    // ---------------------------- ENDPOINTS ------------------------------- //

    // Example: https://www.episodate.com/api/most-popular?page=1
    @GET("most-popular")
    Call<TVShowsResponse> getMostPopularTVShows(@Query("page") int page);

    // Example: https://www.episodate.com/api/show-details?q=arrow
    @GET("show-details")
    Call<TVShowDetailsResponse> getTVShowDetails(@Query("q") String tvShowId);

}
