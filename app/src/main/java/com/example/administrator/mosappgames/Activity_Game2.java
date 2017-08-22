package com.example.administrator.mosappgames;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity_Game2 extends AppCompatActivity {
    public void gomaingame (View view){
        Intent intent = new Intent(this,Activity_Login.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game2);
    }
}
