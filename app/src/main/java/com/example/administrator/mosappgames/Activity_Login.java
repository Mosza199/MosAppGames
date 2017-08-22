package com.example.administrator.mosappgames;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity_Login extends AppCompatActivity {
    public void gomain (View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void gogame1(View view) {
        Intent intent = new Intent(this, Activity_Game1.class);
        startActivity(intent);
    }

    public void gogame2 (View view) {
        Intent intent = new Intent(this, Activity_Game2.class);
        startActivity(intent);
         }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}
