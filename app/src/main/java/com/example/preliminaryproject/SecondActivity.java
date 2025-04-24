package com.example.preliminaryproject;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private TextView tvName, tvSurname, tvScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvName = findViewById(R.id.tvName);
        tvSurname = findViewById(R.id.tvSurname);
        tvScore = findViewById(R.id.tvScore);

        // گرفتن داده‌ها از Intent
        String name = getIntent().getStringExtra("name");
        String surname = getIntent().getStringExtra("surname");
        String score = getIntent().getStringExtra("score");

        // نمایش داده‌ها
        tvName.setText("Name: " + name);
        tvSurname.setText("Surname: " + surname);
        tvScore.setText("Score: " + score);
    }
}
