package com.wen.quizpratice;

import android.content.Context;
import android.content.SharedPreferences;

public class User {
    Context context;
    SharedPreferences setting;
    int age;
    String sex;
    public  User (Context context){
        this.context=context;
        setting = context.getSharedPreferences("user",context.MODE_PRIVATE);
    }

    public int getAge() {
        if(age==0){
            age = setting.getInt("AGE",0);
        }
        return age;
    }

    public void setAge(int age) {

        setting.edit().putInt("AGE",age).apply();
        this.age = age;
    }

    public String getSex() {
        if(sex==null){
            sex = setting.getString("SEX",null);
        }
        return sex;
    }

    public void setSex(String sex) {
        setting.edit().putString("SEX",sex).apply();
        this.sex = sex;
    }
}
