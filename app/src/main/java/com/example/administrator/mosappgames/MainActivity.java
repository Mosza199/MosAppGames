package com.example.administrator.mosappgames;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public void goregiter(View view){
        Intent intent = new Intent(this, Activity_Regiter.class);
        startActivity(intent);
    }

    public void gocontact(View view){
        Intent intent = new Intent(this, Activity_Contact.class);
        startActivity(intent);
    }

    public void gologin(View view){
        Intent intent = new Intent(this, Activity_Login.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
