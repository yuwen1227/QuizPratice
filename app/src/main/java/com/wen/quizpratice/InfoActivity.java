package com.wen.quizpratice;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InfoActivity extends AppCompatActivity {

    private EditText age;
    private EditText sex;
    private Button ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        findViews();
    }

    private void findViews() {
        age = findViewById(R.id.ed_age);
        sex = findViewById(R.id.ed_sex);
        ok = findViewById(R.id.ok);
       /* ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(InfoActivity.this)
                        .setMessage("請確認資料無誤")
                        .setPositiveButton("SURE",null)
                        .setNeutralButton("CANCLE",null)
                        .show();
            }
                    });
    */
    }
    public void ok(View view){
        String a = age.getText().toString();
        String s = sex.getText().toString();
        Intent main = new Intent(this,MainActivity.class);
        startActivity(main);

    }

}
