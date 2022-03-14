package com.example.klicker;

import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    final String LOG_TAG = "myLogs";
    Integer counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickBtnAddDay(View view) {
        counter++;
        TextView counterView = findViewById(R.id.txt_counter);
        ViewGroup.LayoutParams params = counterView.getLayoutParams();
        counterView.setText(counter.toString());
        if (counter >= 1000) {
            params.width = 200;
            params.height = 400;
            counterView.setLayoutParams(params);
        }
        if (counter >= 10000) {
            params.width = 200;
            params.height = 600;
            counterView.setLayoutParams(params);
        }
    }
    public void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState != null && savedInstanceState.containsKey("Count")) {
            counter = savedInstanceState.getInt("Count");
        }
        Log.d(LOG_TAG, "onRestoreInstanceState");
    }
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("Count", counter);
        Log.d(LOG_TAG, "onSaveInstateState");
    }
    public void resetUI(){
        ((TextView) findViewById(R.id.txt_counter)).setText(counter.toString());
        Log.d(LOG_TAG, "resetUI");
    }
    public void onResume(){
        super.onResume();
        Log.d(LOG_TAG, "onResume");
        resetUI();
    }
}