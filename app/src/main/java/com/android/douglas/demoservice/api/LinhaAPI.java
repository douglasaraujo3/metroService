package com.android.douglas.demoservice.api;

import com.android.douglas.demoservice.model.Linha;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by logonrm on 26/06/2017.
 */

public interface LinhaAPI {
    @GET("/linhas")
    Call<List<Linha>> getAll();
}
