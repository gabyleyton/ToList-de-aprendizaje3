package com.example.tolist_de_aprendizaje;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ActivityTransArt extends ObjetivosBase {

    @Override
    protected String[] getObjectives() {
        return new String[]{
                "1. Apreciar producciones artísticas de diversos contextos (en forma directa o a través de medios tecnológicos), describiendo y comparando algunas características visuales, musicales o escénicas (desplazamiento, ritmo, carácter expresivo, colorido, formas, diseño, entre otros).",
                "2. Comunicar sus impresiones, emociones e ideas respecto de diversas obras de arte, producciones propias y de sus pares (artesanías, piezas musicales, obras plásticas y escénicas, entre otras).",
                "3. Interpretar canciones y juegos musicales, utilizando de manera integrada diversos recursos tales como la voz, el cuerpo, instrumentos musicales y objetos.",
                "4. Expresar corporalmente sensaciones, emociones e ideas a partir de la improvisación de escenas dramáticas, juegos teatrales, mímica y danza.",
                "5. Representar plásticamente emociones, ideas, experiencias e intereses, a través de líneas, formas, colores, texturas, con recursos y soportes en plano y volumen.",
                "6. Experimentar diversas combinaciones de expresión plástica, corporal y musical, comunicando las razones del proceso realizado.",
                "7. Representar a través del dibujo, sus ideas, intereses y experiencias, incorporando detalles a las figuras humanas y a objetos de su entorno, ubicándolos en parámetros básicos de organización espacial (arriba/abajo, dentro/fuera)."
        };
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_sciden; // Asegúrate de que este layout exista
    }
}