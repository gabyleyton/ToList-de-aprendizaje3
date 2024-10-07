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

public class SCconv extends ObjetivosBase {

    @Override
    protected String[] getObjectives() {
        return new String[]{
                "1. Interactuar con pares y adultos significativos (a través de gestos y vocalizaciones, entre otros), en diferentes situaciones y juegos.",
                "2. Disfrutar de la cercanía de niños, niñas y adultos en juegos y situaciones cotidianas.",
                "3. Manifestar interés por lo que le sucede a otros niños y niñas, a través de acciones tales como: abrazar a quien está llorando, hacer cariños, entre otros.",
                "4. Manifestar interés por participar en celebraciones de su entorno significativo.",
                "5. Practicar algunas normas de convivencia, tales como: sentarse en su silla para almorzar, saludar, despedirse, y colaborar en acciones cotidianas.",
                "6. Manifestar disposición para responder positivamente o cambiar su comportamiento, frente a requerimientos del adulto, asociados a su seguridad y bienestar."
        };
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_sciden; // Asegúrate de que este layout exista
    }
}