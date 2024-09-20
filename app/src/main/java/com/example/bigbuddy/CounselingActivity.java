package com.example.bigbuddy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class CounselingActivity extends AppCompatActivity {

    Button btnBackCounseling, btnContinueCounseling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counseling);

        btnBackCounseling = findViewById(R.id.btnBackCounseling);
        btnContinueCounseling = findViewById(R.id.btnContinueCounseling);

        btnBackCounseling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });

        btnContinueCounseling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(CounselingActivity.this, MentorshipActivity.class);
                startActivity(intent);
            }
        });
    }
}
