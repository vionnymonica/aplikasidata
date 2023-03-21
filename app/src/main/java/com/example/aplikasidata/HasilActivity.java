package com.example.aplikasidata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HasilActivity extends AppCompatActivity {
//tes android studio
    private TextView txtEmail,txtPassword;
    private Button btnReset;
//viony
    //monica
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        txtEmail = findViewById(R.id.Emailregistered);
        txtPassword= findViewById(R.id.PasswordRegistered);
        btnReset = findViewById(R.id.ButtonReset);

        txtEmail.setText("" + getIntent().getStringExtra("email"));
        txtPassword.setText("" + getIntent().getStringExtra("password"));

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HasilActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}