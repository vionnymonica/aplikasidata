package com.example.aplikasidata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edtEmail,edtPassword;
    private Button btnRegister;
    private void initUI(){
        edtEmail = findViewById(R.id.EditEmail);
        edtPassword = findViewById(R.id.EditPassword);
        btnRegister = findViewById(R.id.Button);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtEmail.getText().toString().equals("")){
                    edtEmail.setError("Email Kosong");
                    Toast.makeText(MainActivity.this, "Masukan Email", Toast.LENGTH_SHORT).show();
                }else if (edtPassword.getText().toString().equals("")){
                    edtPassword.setError("Password Kosong");
                    Toast.makeText(MainActivity.this, "Masukan Password", Toast.LENGTH_SHORT).show();
                }else {
                    if (edtEmail.getError() == null && edtPassword.getError() == null){
                        Intent intent = new Intent(MainActivity.this, HasilActivity.class);

                        intent.putExtra("email", edtEmail.getText().toString());
                        intent.putExtra("password", edtPassword.getText().toString());

                        startActivity(intent);
                    }
                    edtEmail.setText("");
                    edtPassword.setText("");
                }
            }
        });

    }
}