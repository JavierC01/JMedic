package com.unal.jmedic.ui;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.unal.jmedic.R;
import com.unal.jmedic.databinding.ActivityMainBinding;

import com.unal.jmedic.ui.Login.LoginFragment;
import com.unal.jmedic.ui.Register.RegisterFragment;

public class MainActivity extends AppCompatActivity {

    Button buttonlogin;
    Button buttonregister;

    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonlogin = findViewById(R.id.loginbttn);
        buttonregister = findViewById(R.id.registerbttn);

        buttonlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LoginFragment.class);
                startActivity(intent);
            }
        });
        buttonregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RegisterFragment.class);
                startActivity(intent);
            }
        });

    }
}