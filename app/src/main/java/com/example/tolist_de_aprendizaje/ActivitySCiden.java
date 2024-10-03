package com.example.tolist_de_aprendizaje;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

public class ActivitySCiden extends ObjetivosBase {

    @Override
    protected String[] getObjectives() {
        return new String[]{
                "1. Expresar vocal, gestual o corporalmente distintas necesidades o emociones (alegría, miedo, pena, entre otras).",
                "2. Manifestar satisfacción cuando percibe que adultos significativos le expresan afecto.",
                "3. Reconocer algunas emociones en adultos significativos, reaccionando frente a ellas.",
                "4. Manifestar sus preferencias por algunas situaciones, objetos y juegos.",
                "5. Manifestar interés por nuevas situaciones u objetos, ampliando su campo y repertorio de acción habitual.",
                "6. Reconocer algunos rasgos distintivos de su identidad, tales como: su nombre y su imagen física en el espejo.",
                "7. Incorporar rutinas básicas vinculadas a la alimentación, vigilia, sueño, higiene, y vestuario dentro de un contexto diferente a su hogar y sensible a sus necesidades personales."
        };
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_sciden; // Asegúrate de que este layout exista
    }
}