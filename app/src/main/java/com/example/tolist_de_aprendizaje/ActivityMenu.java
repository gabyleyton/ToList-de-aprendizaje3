package com.example.tolist_de_aprendizaje;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;
import android.content.Intent;

import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityMenu extends AppCompatActivity {

    private ViewFlipper vf;
    private int[] image = {R.drawable.a, R.drawable.b, R.drawable.c}; // Asegúrate de que estas imágenes existan

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu); // Asegúrate de que el layout sea correcto

        vf = findViewById(R.id.slider);

        for (int i = 0; i < image.length; i++) {
            flip_image(image[i]);
        }

        vf.setFlipInterval(2800);
        vf.setAutoStart(true);
        vf.setInAnimation(this, android.R.anim.slide_in_left);
        vf.setOutAnimation(this, android.R.anim.slide_out_right);

        Button verObjetivosBtn = findViewById(R.id.verObjetivosBtn);
        verObjetivosBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityMenu.this, SpinnerActivity.class); // Cambia "ActivitySpinner" por el nombre de tu actividad
                startActivity(intent);
            }
        });

        Button registrarEvaluacionBtn = findViewById(R.id.registrarEvaluacionBtn);
        registrarEvaluacionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lógica para registrar evaluación (implementa lo que necesites aquí)
            }
        });

        Button verEstadisticasBtn = findViewById(R.id.verEstadisticasBtn);
        verEstadisticasBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lógica para ver estadísticas (implementa lo que necesites aquí)
            }
        });

        // Sobrescribir la acción del botón "atrás"
        getOnBackPressedDispatcher().addCallback(this, new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {
                new AlertDialog.Builder(ActivityMenu.this)
                        .setMessage("¿Deseas salir de la aplicación?")
                        .setCancelable(false)
                        .setPositiveButton("Sí", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                finish();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        })
                        .show();
            }
        });
    }

    public void flip_image(int i) {
        ImageView view = new ImageView(this);
        view.setBackgroundResource(i);
        vf.addView(view);
    }
}