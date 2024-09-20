package com.example.bigbuddy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class ModeSelectionActivity extends AppCompatActivity {

    Button btnCounseling, btnMentorship, btnChildDevelopment, btnBack, btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mode_selection);

        btnCounseling = findViewById(R.id.btnCounseling);
        btnMentorship = findViewById(R.id.btnMentorship);
        btnChildDevelopment = findViewById(R.id.btnChildDevelopment);
        btnBack = findViewById(R.id.btnBack);
        btnNext = findViewById(R.id.btnNext);


        btnCounseling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModeSelectionActivity.this, CounselingActivity.class);
                startActivity(intent);
            }
        });


        btnMentorship.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModeSelectionActivity.this, MentorshipActivity.class);
                startActivity(intent);
            }
        });


        btnChildDevelopment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModeSelectionActivity.this, ChildDevelopmentActivity.class);
                startActivity(intent);
            }
        });


        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Goes back to previous activity
            }
        });


        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
