package com.example.ronsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity  {


    Button historyLog;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      //history logs
      historyLog = findViewById(R.id.historyLogsBtn);

      historyLog.setOnClickListener(new OnClickListener() {
          @Override
          public void onClick(View v) {
              Toast.makeText(getApplicationContext(), "History Log Btn 2", Toast.LENGTH_LONG).show();
          }
      });

    }

}
