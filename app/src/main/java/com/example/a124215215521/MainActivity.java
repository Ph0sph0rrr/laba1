package com.example.a124215215521;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btn1 = findViewById(R.id.button);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Создаем Intent для перехода к Activity 2
                Intent intent = new Intent(MainActivity.this, Activity2.class);

                // Передаем параметр (фамилию)
                String surname = "Velikanov";
                intent.putExtra("Velikanov", surname);

                // Запускаем Activity 2
                startActivity(intent);

            }
        });
    }
}