package com.example.tvshows.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.tvshows.repositories.SearchTVShowsRepository;
import com.example.tvshows.responses.TVShowsResponse;

public class SearchViewModel extends ViewModel {

    private SearchTVShowsRepository searchTVShowsRepository;

    public SearchViewModel() {
        searchTVShowsRepository = new SearchTVShowsRepository();
    }
    
    public LiveData<TVShowsResponse> searchTVShow(String query, int page) {
        return searchTVShowsRepository.searchTVShow(query, page);
    }
}
