package com.example.bigbuddy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class NextChildDevelopmentActivity extends AppCompatActivity {

    private Button btnBack, btnProceedToLiveSessions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_child_development);


        btnBack = findViewById(R.id.btnBack);
        btnProceedToLiveSessions = findViewById(R.id.btnProceedToLiveSessions);


        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });


        btnProceedToLiveSessions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(NextChildDevelopmentActivity.this, LiveSessionsActivity.class);
                startActivity(intent);
            }
        });
    }
}
