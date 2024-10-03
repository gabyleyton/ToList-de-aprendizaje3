package com.example.tolist_de_aprendizaje;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Activity_IyA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_iy);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Configura el botón IdenSCbtn
        Button idenSCbtn = findViewById(R.id.IdenSCbtn);
        idenSCbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_IyA.this, ActivitySCiden.class);
                startActivity(intent);
            }
        });

        // Configura el botón IdenMedbtn
        Button idenMedbtn = findViewById(R.id.IdenMedbtn);
        idenMedbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_IyA.this, ActivityMediosIden.class);
                startActivity(intent);
            }
        });

        // Configura el botón IdenTranbtn
        Button IdenTranbtn = findViewById(R.id.IdenTranbtn);
        IdenTranbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_IyA.this, ActivityTransIden.class);
                startActivity(intent);
            }
        });
    }
}