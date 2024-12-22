package com.mastercoding.themovieapp.serviceapi;

import com.mastercoding.themovieapp.model.Result;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MovieApiService {

    // The service interface defines the structure
    // and behaviour of the API request
    // Acts as a bridge between your app and the API

    //@GET("end points")
    @GET("movie/popular")
    //retrofit use Call class to represent a network request and its response.
    //reponse type should be replace with the actual data model class that
    // represents the expected response from the API.
    Call<Result> getPopularMovies(@Query("api_key") String apiKey);
}
