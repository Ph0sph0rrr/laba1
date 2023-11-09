package com.example.a124215215521;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;




public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        // Извлекаем переданный параметр
        String surname = getIntent().getStringExtra("Velikanov");

        // Находим TextView в макете
        TextView textView2 = findViewById(R.id.textView2);

        // Устанавливаем текст с переданным параметром
        textView2.setText("Переданный параметр: " + surname);



    }
}