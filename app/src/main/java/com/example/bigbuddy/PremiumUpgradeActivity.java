package com.example.bigbuddy;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class PremiumUpgradeActivity extends AppCompatActivity {

    private Button btnMonthly, btnWeekly, btnAnnually, btnBackToLiveSessions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_premium_upgrade);


        btnMonthly = findViewById(R.id.btnMonthly);
        btnWeekly = findViewById(R.id.btnWeekly);
        btnAnnually = findViewById(R.id.btnAnnually);
        btnBackToLiveSessions = findViewById(R.id.btnBackToLiveSessions);


        btnMonthly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PremiumUpgradeActivity.this, "Monthly Subscription Selected: $9.99", Toast.LENGTH_SHORT).show();
            }
        });


        btnWeekly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PremiumUpgradeActivity.this, "Weekly Subscription Selected: $3.99", Toast.LENGTH_SHORT).show();
            }
        });


        btnAnnually.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PremiumUpgradeActivity.this, "Annually Subscription Selected: $99.99", Toast.LENGTH_SHORT).show();
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
