package com.example.base_app;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

public interface HottoApi {
    @GET("/?key=e5316549de94b917&lat=26.25345333&lng=127.76638333333334&range=5&order=3&format=json")
    void getHotto(Callback<Pepper> response);
}


