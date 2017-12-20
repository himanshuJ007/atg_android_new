package com.ATG.World.network;

import com.ATG.World.R;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Chetan on 06-12-2017.
 */

public class AtgClient {
    public static final String BASE_URL = getString(R.string.WS_HOST);

    private static Retrofit retrofit = null ;

    public static Retrofit getClient () {
        if (retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build() ;
        }
        return retrofit ;
    }
}
