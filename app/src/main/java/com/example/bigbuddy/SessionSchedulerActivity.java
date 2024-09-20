package com.example.bigbuddy;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class SessionSchedulerActivity extends AppCompatActivity {

    private Button btnSelectTimeSlot1, btnSelectTimeSlot2, btnConfirmSession, btnBackToLiveSessions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_session_scheduler);

        // Initialize buttons
        btnSelectTimeSlot1 = findViewById(R.id.btnSelectTimeSlot1);
        btnSelectTimeSlot2 = findViewById(R.id.btnSelectTimeSlot2);
        btnConfirmSession = findViewById(R.id.btnConfirmSession);
        btnBackToLiveSessions = findViewById(R.id.btnBackToLiveSessions);


        btnSelectTimeSlot1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SessionSchedulerActivity.this, "Time Slot 1 Selected", Toast.LENGTH_SHORT).show();
            }
        });


        btnSelectTimeSlot2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SessionSchedulerActivity.this, "Time Slot 2 Selected", Toast.LENGTH_SHORT).show();
            }
        });


        btnConfirmSession.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SessionSchedulerActivity.this, "Session Confirmed!", Toast.LENGTH_SHORT).show();
            }
        });


        btnBackToLiveSessions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
