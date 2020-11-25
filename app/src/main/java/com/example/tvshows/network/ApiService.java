package com.example.tvshows.network;

import com.example.tvshows.models.TVShow;
import com.example.tvshows.responses.TVShowDetailsResponse;
import com.example.tvshows.responses.TVShowsResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {

    // ---------------------------- ENDPOINTS ------------------------------- //

    // URL: /api/most-popular?page=:page
    // Example: https://www.episodate.com/api/most-popular?page=1
    @GET("most-popular")
    Call<TVShowsResponse> getMostPopularTVShows(@Query("page") int page);

    // URL: /api/show-details?q=:show
    // Example: https://www.episodate.com/api/show-details?q=arrow
    @GET("show-details")
    Call<TVShowDetailsResponse> getTVShowDetails(@Query("q") String tvShowId);

    // URL: /api/search?q=:search&page=:page
    // Example: https://www.episodate.com/api/search?q=arrow&page=1
    @GET("search")
    Call<TVShowsResponse> searchTVShow(@Query("q") String query, @Query("page") int page);


}
