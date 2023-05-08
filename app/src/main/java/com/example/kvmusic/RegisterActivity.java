package com.example.kvmusic;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {
    private EditText registerUsername;
    private EditText registerPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        registerUsername = findViewById(R.id.register_username);
        registerPassword = findViewById(R.id.register_password);
        Button registerBtn = findViewById(R.id.register_btn);
        registerBtn.setOnClickListener(v -> {
            // 获取输入的账号和密码
            String username = registerUsername.getText().toString();
            String password = registerPassword.getText().toString();
            // 将账号和密码保存到SharedPreferences中
            SharedPreferences sharedPreferences = getSharedPreferences("user", MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString("username", username);
            editor.putString("password", password);
            editor.apply();
            // 提示用户注册成功
            Toast.makeText(RegisterActivity.this, "注册成功", Toast.LENGTH_SHORT).show();
            // 结束当前页面返回登录页面
            finish();
        });
    }
}