package com.yavuzoktay.jsonplaceholder.networks;

import com.yavuzoktay.jsonplaceholder.models.AlbumsModel;
import com.yavuzoktay.jsonplaceholder.models.PhotosModel;
import com.yavuzoktay.jsonplaceholder.models.PlaceHolderModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Yavuz on 15.8.2017.
 */

public interface ServiceGenerator {
    @GET("/users")
    Call<List<PlaceHolderModel>> placeHolderModel();

    @GET("/albums")
    Call<List<AlbumsModel>> placeAlbums(@Query("userId") int userId);

    @GET("/photos")
    Call<List<PhotosModel>> placePhotos(@Query("albumId") int albumId) ;



}
