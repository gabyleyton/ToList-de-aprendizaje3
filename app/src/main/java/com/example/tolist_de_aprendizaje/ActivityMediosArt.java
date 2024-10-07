package com.example.tolist_de_aprendizaje;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ActivityMediosArt extends ObjetivosBase {

    @Override
    protected String[] getObjectives() {
        return new String[]{
                "1. Manifestar interés por diversas producciones artísticas (arquitectura, modelado, piezas musicales, pintura, dibujos, títeres, obras de teatro, danzas, entre otras), describiendo algunas características.",
                "2. Expresar sus preferencias, sensaciones y emociones relacionadas con diferentes recursos expresivos que se encuentran en sencillas obras visuales (colorido, formas), musicales (fuente, intensidad del sonido) o escénicas (desplazamiento, vestimenta, carácter expresivo).",
                "3. Interpretar canciones y juegos musicales, experimentando con diversos recursos tales como la voz, el cuerpo, instrumentos musicales y objetos.",
                "4. Expresar corporalmente sensaciones y emociones experimentando con mímica, juegos teatrales, rondas, bailes y danzas.",
                "5. Expresar emociones, ideas y experiencias por medio de la plástica, experimentando con recursos pictóricos, gráficos y de modelado.",
                "6. Experimentar diversas posibilidades de expresión, combinando lenguajes artísticos en sus producciones.",
                "7. Representar a través del dibujo, diversos elementos de su entorno, incorporando figuras cerradas, trazos intencionados y primeros esbozos de la figura humana."
        };
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_sciden; // Asegúrate de que este layout exista
    }
}