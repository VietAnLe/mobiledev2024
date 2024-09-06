package vn.edu.usth.weatheractivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class WeatherActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_weather);

        ForecastFragment firstFragment = new ForecastFragment();

        getFragmentManager().beginTransaction().add(
        R.id.main, firstFragment).commit();

        // Log function traces
        Log.i("WeatherActivity", "onCreate()");
    }

    public WeatherActivity(){
        super();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("WeatherActivity", "onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("WeatherActivity", "onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("WeatherActivity", "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("WeatherActivity", "onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("WeatherActivity", "onDestroy()");
    }
}
