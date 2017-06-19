package Controllers;

import java.util.List;

import Models.Department;
import Provider.RestProvider;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Pavilion on 18/6/2017.
 */
public class BaseController {
    private RestProvider service;
    private final Retrofit retrofit;
    private String API_ROOT = "https://design-service.herokuapp.com/";

    public BaseController() {

        this.retrofit = new Retrofit.Builder().baseUrl(API_ROOT).addConverterFactory(GsonConverterFactory.create()).build();
        this.service = retrofit.create(RestProvider.class);

    }

    public RestProvider getService() {
        return service;
    }

    public void setService(RestProvider service) {
        this.service = service;
    }

    public Retrofit getRetrofit() {
        return retrofit;
    }
}
