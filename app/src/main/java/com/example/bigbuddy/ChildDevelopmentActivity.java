package com.example.bigbuddy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class ChildDevelopmentActivity extends AppCompatActivity {

    private Button btnBackChildDevelopment;
    private Button btnContinueChildDevelopment;
    private Button btnLiveSessions; // New button for Live Sessions
    private Button btnSeePremium;   // New button for Premium Section

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child_development);


        btnBackChildDevelopment = findViewById(R.id.btnBackChildDevelopment);
        btnContinueChildDevelopment = findViewById(R.id.btnContinueChildDevelopment);
        btnLiveSessions = findViewById(R.id.btnLiveSessions);   // Initialize Live Sessions button
        btnSeePremium = findViewById(R.id.btnSeePremium);       // Initialize Premium button


        btnBackChildDevelopment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Go back to mode selection
                finish();
            }
        });

        btnContinueChildDevelopment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Proceed to the next page or activity
                Intent intent = new Intent(ChildDevelopmentActivity.this, NextChildDevelopmentActivity.class);
                startActivity(intent);
            }
        });


        btnLiveSessions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Go to Live Sessions activity
                Intent intent = new Intent(ChildDevelopmentActivity.this, LiveSessionsActivity.class);
                startActivity(intent);
            }
        });


        btnSeePremium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Go to Premium Section
                Intent intent = new Intent(ChildDevelopmentActivity.this, NextChildDevelopmentActivity.class);
                startActivity(intent);
            }
        });
    }
}
