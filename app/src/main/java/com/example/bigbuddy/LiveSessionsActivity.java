package com.example.bigbuddy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class LiveSessionsActivity extends AppCompatActivity {

    private Button btnScheduleSession, btnUpgradeToPremium, btnBackToMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_sessions);


        btnScheduleSession = findViewById(R.id.btnScheduleSession);
        btnUpgradeToPremium = findViewById(R.id.btnUpgradeToPremium);
        btnBackToMain = findViewById(R.id.btnBackToMain);


        btnScheduleSession.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(LiveSessionsActivity.this, SessionSchedulerActivity.class);
                startActivity(intent);
            }
        });


        btnUpgradeToPremium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(LiveSessionsActivity.this, PremiumUpgradeActivity.class);
                startActivity(intent);
            }
        });


        btnBackToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Go back to previous activity
                finish();
            }
        });
    }
}
