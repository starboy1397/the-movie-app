package com.mastercoding.themovieapp.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.mastercoding.themovieapp.model.Movie;
import com.mastercoding.themovieapp.model.MovieRepository;

import java.util.List;

public class MainActivityViewModel extends AndroidViewModel {
    //ViewModel:- suitable for non-android-specific logic like
    // data transformation and presentation logic
    //AndroidViewModel:- used when viewModel class need to access
    //android specific components like accessing resources, working with preference,
    // performing database operation.

    private MovieRepository movieRepository;

    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        this.movieRepository = new MovieRepository(application);
    }

    // live data
    public LiveData<List<Movie>> getAllMovies() {
        return movieRepository.getMutableLiveData();
    }
}
