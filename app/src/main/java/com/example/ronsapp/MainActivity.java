package com.example.ronsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity  {

    //buttons
    Button historyLog;
    Button closeApp;
    Button securityCam;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      //history logs
      historyLog = findViewById(R.id.historyLogsBtn);

      //close app
      closeApp = findViewById(R.id.closeBtn);

      //security cam view
      securityCam = findViewById(R.id.camViewBtn);

      historyLog.setOnClickListener(new OnClickListener() {
          @Override

          public void onClick(View v) {
              Toast.makeText(getApplicationContext(), "History Log Btn 2", Toast.LENGTH_LONG).show();
               DropBoxActivity();
          }
      });

      closeApp.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Close App Text", Toast.LENGTH_LONG).show();
                finish();
                System.exit(0);

            }
        });

      securityCam.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Security Camera View Text", Toast.LENGTH_LONG).show();
            }
        });
    }


    public void DropBoxActivity() {
        Intent intent = new Intent(this, DropBoxActivity.class);
        startActivity(intent);
    }
}
