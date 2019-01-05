package com.wen.quizpratice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private EditText username;
    private EditText password;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        findViews();
        String u = getSharedPreferences("login",MODE_PRIVATE)
                .getString("Username"," ");
        username.setText(u);
    }
    private void findViews() {
        username = findViewById(R.id.edUsername);
        password = findViewById(R.id.edPassword);
        login = findViewById(R.id.login);
    }
    public void login(View view){
    String u = username.getText().toString();
    String p = password.getText().toString();
    if("aaa".equals(username)&&"1234".equals(password)){
        getSharedPreferences("login",MODE_PRIVATE)
                .edit()
                .putString("Username",u)
                .apply();
           }
        Intent intentif = new Intent(this,InfoActivity.class);
        startActivity(intentif);
    }
}

