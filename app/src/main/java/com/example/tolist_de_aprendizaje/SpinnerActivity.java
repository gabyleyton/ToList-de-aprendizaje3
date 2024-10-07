package com.example.tolist_de_aprendizaje;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

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

            Intent intent = null;

            // Lógica para dirigir a la actividad correcta
            if (selectedNivel.equals("Desarrollo personal y social")) {
                if (selectedSubnivel.equals("Identidad y autonomía")) {
                    if (selectedProyecto.equals("Sala cuna")) {
                        intent = new Intent(SpinnerActivity.this, ActivitySCiden.class);
                    } else if (selectedProyecto.equals("Niveles medios")) {
                        intent = new Intent(SpinnerActivity.this, ActivityMediosIden.class);
                    } else if (selectedProyecto.equals("Transición")) {
                        intent = new Intent(SpinnerActivity.this, ActivityTransIden.class);
                    }
                } else if (selectedSubnivel.equals("Convivencia y ciudadanía")) {
                    if (selectedProyecto.equals("Sala cuna")) {
                        intent = new Intent(SpinnerActivity.this, SCconv.class);
                    } else if (selectedProyecto.equals("Niveles medios")) {
                        intent = new Intent(SpinnerActivity.this, ActivityMediosConv.class);
                    } else if (selectedProyecto.equals("Transición")) {
                        intent = new Intent(SpinnerActivity.this, ActivityTransConv.class);
                    }
                }
                // Aquí puedes agregar más condiciones si es necesario
            } else if (selectedNivel.equals("Comunicación integral")) {
                if (selectedSubnivel.equals("Lenguaje verbal")) {
                    if (selectedProyecto.equals("Sala cuna")) {
                        intent = new Intent(SpinnerActivity.this, ActivityScVerb.class);
                    } else if (selectedProyecto.equals("Niveles medios")) {
                        intent = new Intent(SpinnerActivity.this, ActivityMediosVerb.class);
                    } else if (selectedProyecto.equals("Transición")) {
                        intent = new Intent(SpinnerActivity.this, ActivityTransVerb.class);
                    }
                } else if (selectedSubnivel.equals("Lenguajes artísticos")) {
                    if (selectedProyecto.equals("Sala cuna")) {
                        intent = new Intent(SpinnerActivity.this, ActivityScArt.class);
                    } else if (selectedProyecto.equals("Niveles medios")) {
                        intent = new Intent(SpinnerActivity.this, ActivityMediosArt.class);
                    } else if (selectedProyecto.equals("Transición")) {
                        intent = new Intent(SpinnerActivity.this, ActivityTransArt.class);
                    }
                }
            }

            if (intent != null) {
                startActivity(intent);
            } else {
                // Manejo de error si no se encontró la actividad
                // Puedes mostrar un Toast o un mensaje al usuario
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