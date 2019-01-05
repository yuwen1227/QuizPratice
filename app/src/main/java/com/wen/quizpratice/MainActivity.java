package com.wen.quizpratice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    boolean logon = false;
    ArrayList<>
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(!logon){
            Intent intent = new Intent(this,LoginActivity.class);
            startActivity(intent);
        }

    }
}
