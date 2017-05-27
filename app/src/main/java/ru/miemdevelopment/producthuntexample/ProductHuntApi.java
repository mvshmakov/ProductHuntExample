package ru.miemdevelopment.producthuntexample;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;
import ru.miemdevelopment.producthuntexample.models.Post;
import ru.miemdevelopment.producthuntexample.models.PostModel;

public interface ProductHuntApi {

    String access_token = "591f99547f569b05ba7d8777e2e0824eea16c440292cce1f8dfb3952cc9937ff";

    @Headers({"Accept: application/json" +
            " Content-Type: application/json Authorization: Bearer " + access_token +
            " Host: api.producthunt.com"})
    @GET("/v1/posts/all")
    Call<PostModel> getData(@Query("search[category]") String categoryName, @Query("per_page") int numberOfElements);
}