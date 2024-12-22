package com.mastercoding.themovieapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Result {
    // @SerializedName() used to specify the name of the json key and corresponds
    //to a particular field or property in your kotlin or java class
    // This annotation is especially useful when the variable names in your clas
    //differ from the json key
    @SerializedName("page")
    // @Expose is specify which fields should be included or excluded
    // when json serialize and deserialize objects
    //by default json includes all fields in serialization and deserialization
    //however, when you annotate a field with an expose annotation, you control
    //whether that field is included or exclude using gson, json builder and exclude field
    //without expose annotation method.
    @Expose
    private int pageNumber;
    @SerializedName("total_pages")
    @Expose
    private int totalPages;
    @SerializedName("total_results")
    @Expose
    private int totalResults;
    @SerializedName("results")
    @Expose
    private List<Movie> results = null;

    public int getPage() {
        return pageNumber;
    }

    public void setPage(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public List<Movie> getResults() {
        return results;
    }

    public void setResults(List<Movie> results) {
        this.results = results;
    }

    public Result() {
        //empty constructor to prevent any null pointer exception
    }
}
