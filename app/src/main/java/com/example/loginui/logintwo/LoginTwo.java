package com.example.loginui.logintwo;

import android.os.Bundle;
import android.os.PersistableBundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.loginui.R;
import com.example.loginui.logintwo.fragment.LoginFragment;

public class LoginTwo extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_two);

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.form_placeholder, new LoginFragment())
                .commit();
    }
}