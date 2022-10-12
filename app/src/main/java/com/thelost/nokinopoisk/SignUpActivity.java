package com.thelost.nokinopoisk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.thelost.nokinopoisk.databinding.ActivitySignUpBinding;

public class SignUpActivity extends AppCompatActivity {

    ActivitySignUpBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignUpBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String login = binding.userLogin.getText().toString();
                String pass = binding.userPassword.getText().toString();
                String email = binding.userEmail.getText().toString();
                String phone = binding.userPhone.getText().toString();

                //Если регистрация пройдена то открвается окно вхада
                //После реализации бд сделай проверку
                Intent intent = new Intent(getApplication(), SignInActivity.class);
                startActivity(intent);
            }
        });

        binding.btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplication(), SignInActivity.class);
                startActivity(intent);
            }
        });
    }
}