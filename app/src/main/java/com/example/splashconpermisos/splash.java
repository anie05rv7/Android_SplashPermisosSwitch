package com.example.splashconpermisos;
import android.os.CountDownTimer;
import android.widget.TextView;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class splash extends AppCompatActivity {

    private static final int COUNTDOWN_SECONDS = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_activity); // Asegúrate de que el diseño se llame "splash"

        new CountDownTimer(COUNTDOWN_SECONDS * 1000, 1000) {
            public void onTick(long millisUntilFinished) {
                int secondsRemaining = (int) (millisUntilFinished / 1000);
                TextView countdownText = findViewById(R.id.countdownText);
                countdownText.setText(String.valueOf(secondsRemaining));
            }


            public void onFinish() {
                // Cuando finalice el contador, inicia la actividad "MainActivity"
                Intent intent = new Intent(splash.this, MainActivity.class);
                startActivity(intent);
                finish(); // Finaliza la actividad actual (Splash) si no deseas volver a ella
            }
        }.start();
    }
}
