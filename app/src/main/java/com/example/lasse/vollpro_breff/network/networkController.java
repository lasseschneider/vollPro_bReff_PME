package com.example.lasse.vollpro_breff.network;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Lasse on 05.07.2016.
 */
public interface networkController {

    //retrofit und Vorlesung Netzwerkommunikation
    String BASE_URL = "localhost:8080/api/";

    @GET("userres/")
    Call<String> getUserrres();

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .build();
    networkController service = retrofit.create(networkController.class);
}
