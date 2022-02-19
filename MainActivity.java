package com.example.klicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public Integer counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickBtnAddStudents(View view) {
        counter++;
        TextView counterView = (TextView) findViewById(R.id.txt_counter);
        counterView.setText(counter.toString());
        if(counter >= 1000){
            TextView layout = (TextView)findViewById(R.id.txt_counter);
            ViewGroup.LayoutParams params = layout.getLayoutParams();
            params.height = 200;
            params.height = 400;
            layout.setLayoutParams(params);
        }
        if(counter >= 10000){
            TextView layout = (TextView)findViewById(R.id.txt_counter);
            ViewGroup.LayoutParams params = layout.getLayoutParams();
            params.height = 200;
            params.height = 600;
            layout.setLayoutParams(params);
        }
    }
}