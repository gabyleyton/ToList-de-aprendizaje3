package com.example.tolist_de_aprendizaje;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.HashMap;

public class SpinnerActivity extends AppCompatActivity {
    private Spinner spinnerNiveles;
    private Spinner spinnerSubniveles;
    private Spinner spinnerProyecto;
    private Button buttonSiguiente;

    private HashMap<String, String[]> subnivelesMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner); // Asegúrate de que el layout esté correctamente referenciado

        spinnerNiveles = findViewById(R.id.spinnerNiveles);
        spinnerSubniveles = findViewById(R.id.spinnerSubniveles);
        spinnerProyecto = findViewById(R.id.spinnerProyecto);
        buttonSiguiente = findViewById(R.id.buttonSiguiente);

        // Definición de los niveles
        String[] niveles = {"Desarrollo personal y social", "Comunicación integral"};

        // Mapa de subniveles
        subnivelesMap = new HashMap<>();
        subnivelesMap.put("Desarrollo personal y social", new String[]{
                "Identidad y autonomía",
                "Convivencia y ciudadanía",
                "Corporalidad y movimiento"
        });
        subnivelesMap.put("Comunicación integral", new String[]{
                "Lenguaje verbal",
                "Lenguajes artísticos"
        });

        // Adaptador para el primer Spinner
        ArrayAdapter<String> nivelesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, niveles);
        nivelesAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerNiveles.setAdapter(nivelesAdapter);

        // Adaptador para el Spinner de proyecto
        String[] proyectos = {"Sala cuna", "Niveles medios", "Transición"};
        ArrayAdapter<String> proyectosAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, proyectos);
        proyectosAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerProyecto.setAdapter(proyectosAdapter);

        // Listener para cambios en el primer Spinner
        spinnerNiveles.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedNivel = (String) parent.getItemAtPosition(position);
                updateSubniveles(selectedNivel);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // No hacer nada
            }
        });

        // Configurar el botón para ir a la actividad correspondiente
        buttonSiguiente.setOnClickListener(v -> {
            String selectedProyecto = (String) spinnerProyecto.getSelectedItem();
            String selectedSubnivel = (String) spinnerSubniveles.getSelectedItem();
            String selectedNivel = (String) spinnerNiveles.getSelectedItem();

            // Lógica para dirigir a la actividad correcta
            if (selectedNivel.equals("Desarrollo personal y social") &&
                    selectedSubnivel.equals("Identidad y autonomía") &&
                    selectedProyecto.equals("Niveles medios")) {

                Intent intent = new Intent(SpinnerActivity.this, ActivityMediosIden.class); // Cambia el nombre de la clase según corresponda
                startActivity(intent);
            } else {
                // Puedes manejar otras combinaciones aquí o redirigir a una actividad por defecto
            }
        });
    }

    private void updateSubniveles(String nivel) {
        String[] subniveles = subnivelesMap.get(nivel);
        ArrayAdapter<String> subnivelesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, subniveles);
        subnivelesAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerSubniveles.setAdapter(subnivelesAdapter);
    }
}