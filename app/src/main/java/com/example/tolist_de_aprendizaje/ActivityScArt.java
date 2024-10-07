package com.example.tolist_de_aprendizaje;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ActivityScArt extends ObjetivosBase {

    @Override
    protected String[] getObjectives() {
        return new String[]{
                "1. Manifestar interés por los sonidos, las texturas, los colores y la luminosidad de su entorno, respondiendo a través de diversas formas, tales como balbuceo, gestos, sonrisas, entre otros.",
                "2. Producir sonidos con su voz, su cuerpo y diversos objetos sonoros, en forma espontánea o por imitación.",
                "3. Imitar gestos, movimientos, sonidos de su entorno significativo, a través de diversos medios.",
                "4. Manifestar sus preferencias por recursos expresivos presentes en piezas musicales, visuales y escénicas, a través de gestos, movimientos, palabras, entre otros.",
                "5. Expresar corporalmente las emociones y sensaciones que le provocan algunas piezas musicales, bailando, cantando e intentando seguir el ritmo.",
                "6. Experimentar sus posibilidades de expresión plástica a través de diversos recursos, produciendo sus primeros garabateos espontáneos."
        };
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_sciden; // Asegúrate de que este layout exista
    }
}