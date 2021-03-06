package com.example.jaykayitare.rebel;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by jaykayitare on 3/12/16.
 */
public interface SCService {

    @GET("/tracks?client_id=" + Config.CLIENT_ID)
    public void getRecentTracks(@Query("created_at[from]") String date, Callback<List<Track>> cb);

    @GET("/tracks?client_id=" + Config.CLIENT_ID)
    void getUserTracks(@Query("permalink_url[https://soundcloud.com/reach-records]") Callback<List<Track>> cb);
}
