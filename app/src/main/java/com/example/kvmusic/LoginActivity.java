package com.example.kvmusic;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    private EditText username;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_login);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        Button login = findViewById(R.id.login);
        login.setOnClickListener(v -> {
            // 获取输入的账号和密码
            String inputUsername = username.getText().toString();
            String inputPassword = password.getText().toString();
            // 读取SharedPreferences中保存的账号和密码
            SharedPreferences sharedPreferences = getSharedPreferences("user", MODE_PRIVATE);
            String savedUsername = sharedPreferences.getString("username", "");
            String savedPassword = sharedPreferences.getString("password", "");
            // 比较输入的账号和密码与保存的账号和密码是否相同
            if (savedUsername.equals(inputUsername) && savedPassword.equals(inputPassword)) {
                // 登录成功，跳转到二级页面
                Intent intent = new Intent(LoginActivity.this, MusicPlayer.class);
                startActivity(intent);
                Toast.makeText(LoginActivity.this, "登录成功", Toast.LENGTH_SHORT).show();
            } else {
                // 登录失败，提示用户
                Toast.makeText(LoginActivity.this, "账号或密码错误", Toast.LENGTH_SHORT).show();
            }
        });

        TextView register = findViewById(R.id.register);
        register.setOnClickListener(v -> {
            Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
            startActivity(intent);
        });
    }


}