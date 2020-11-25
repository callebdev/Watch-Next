package com.example.tvshows;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import com.example.tvshows.network.ApiClient;
import com.example.tvshows.network.ApiService;
import com.example.tvshows.repositories.TVShowDetailsRepository;
import com.example.tvshows.responses.TVShowDetailsResponse;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Objects;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
public class TVShowsInstrumentedTest {

//
//    @Test
//    public void tvShowByIdRequest() {
//
//        String arrowId = "29560";
//        String arrowImagePath = "https://static.episodate.com/images/tv-show/full/29560.jpg";
//
//        TVShowDetailsRepository tvShowDetailsRepository = new TVShowDetailsRepository();
//        LiveData<TVShowDetailsResponse> tvShowDetailsResponse = tvShowDetailsRepository.getTVShowDetails(arrowId);
//        // assertEquals(arrowImagePath, Objects.requireNonNull(tvShowDetailsResponse.getValue()).getTvShowDetails().getImagePath());
//        assertEquals(arrowImagePath, );
//
//    }
//
//
//    public TVShowDetailsResponse getTVShowDetails(String tvShowId) {
//        ApiService apiService = ApiClient.getRetrofit().create(ApiService.class);
//
//        TVShowDetailsResponse data = new TVShowDetailsResponse();
//
//        apiService.getTVShowDetails(tvShowId).enqueue(new Callback<TVShowDetailsResponse>() {
//            @Override
//            public void onResponse(@NonNull Call<TVShowDetailsResponse> call, @NonNull Response<TVShowDetailsResponse> response) {
//                data.setValue(response.body());
//            }
//
//            @Override
//            public void onFailure(@NonNull Call<TVShowDetailsResponse> call, @NonNull Throwable t) {
//                data.setValue(null);
//            }
//        });
//
//        return data;
//    }
}
