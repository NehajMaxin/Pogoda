package com.example.wadad.prognozpogody;

import retrofit2.Retrofit;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Максим on 20.07.2016.
 */
public class WetherRestAPI {
    private String BASE_URL = "https://api.openweathermap.org/data/2.5/weather" ;

    Retrofit client = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            //.addConverterFactory(GsonConverterFactory.create())
            .build();
    WeatherApiInterface rest_api = client.create(WeatherApiInterface.class);
    //Call<Weather> weather = rest_api.getWeather(WeatherGPS.imHere.getLatitude(), WeatherGPS.imHere.getLongitude());
    public interface WeatherApiInterface {

        @GET("?lat={lat}&lon={lon}")
        String getWeather(@Path("lat") double lat, @Path("lon") double lon);
    }
}
