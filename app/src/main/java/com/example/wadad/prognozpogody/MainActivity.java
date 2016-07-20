package com.example.wadad.prognozpogody;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    Button updateButton;
    TextView textView;
    WetherRestAPI api= new WetherRestAPI();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        updateButton = (Button) findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.textView);

        WeatherGPS.SetUpLocationListener(this);
        //retrofit.create(Weather.class)
        String a = api.rest_api.getWeather(WeatherGPS.imHere.getLatitude(),WeatherGPS.imHere.getLongitude());
        textView.setText(a);

    }
    View.OnClickListener myButtonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };
}
