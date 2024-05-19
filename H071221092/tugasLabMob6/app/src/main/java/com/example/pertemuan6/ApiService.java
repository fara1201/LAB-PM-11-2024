package com.example.pertemuan6;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {
    @GET("api/users") //u keseluruhan 1 page awal ditampilkan sesuai yg ditentukan dulu
    Call<UserResponse> getUsers(@Query("page") int page, @Query("per_page") int per_page);

    @GET("api/users/{id}") //u ambil detail data berdasarkan ID
    Call<User> getUserById(@Path("id") int userId);
}