package com.studio.bakti.androidretrofitexample;

import retrofit.http.GET;

/**
 * Created by bakti on 1/11/15.
 */
public interface Data {
    @GET("")
    public String getData();
}


