package com.ketanaakule.facedetectionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class SplashScreen extends AppCompatActivity {
    TextView appTitle,ownerName;
    LottieAnimationView lottieAnimationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        appTitle = findViewById(R.id.appTitle);
        lottieAnimationView = findViewById(R.id.splashScreen);
        ownerName = findViewById(R.id.ownerName);

        ownerName.animate().translationY(-2500).setDuration(1000).setStartDelay(4000);
        appTitle.animate().translationY(-2500).setDuration(1000).setStartDelay(4000);
        lottieAnimationView.animate().translationY(2500).setDuration(900).setStartDelay(5000);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashScreen.this, MainActivity.class));

                finish();
            }
        },3850);
    }
}