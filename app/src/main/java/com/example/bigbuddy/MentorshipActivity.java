package com.example.bigbuddy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MentorshipActivity extends AppCompatActivity {

    Button btnBackMentorship, btnContinueMentorship;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mentorship);

        btnBackMentorship = findViewById(R.id.btnBackMentorship);
        btnContinueMentorship = findViewById(R.id.btnContinueMentorship);

        btnBackMentorship.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });

        btnContinueMentorship.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MentorshipActivity.this, ChildDevelopmentActivity.class);
                startActivity(intent);
            }
        });
    }
}
