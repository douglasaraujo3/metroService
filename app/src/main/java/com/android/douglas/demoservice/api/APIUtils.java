package com.android.douglas.demoservice.api;

/**
 * Created by logonrm on 26/06/2017.
 */

public class APIUtils {
    public static final String BASE_URL = "http://10.3.1.7:3000/";

    public static LinhaAPI getLinhaAPIVersion(){
        return RetrofitCliente.getClient(BASE_URL).create(LinhaAPI.class);

    }
}
