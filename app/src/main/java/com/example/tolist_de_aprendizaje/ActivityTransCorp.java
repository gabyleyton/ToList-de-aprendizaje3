package com.example.tolist_de_aprendizaje;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ActivityTransCorp extends ObjetivosBase {

    @Override
    protected String[] getObjectives() {
        return new String[]{
                "1. Manifestar iniciativa para resguardar el autocuidado de su cuerpo y su confortabilidad, en función de su propio bienestar.",
                "2. Apreciar sus características corporales, manifestando interés y cuidado por su bienestar y apariencia personal.",
                "3. Tomar conciencia de su cuerpo, de algunas de sus características internas (tales como: ritmo cardíaco, de respiración), de su esquema y progresivamente de su tono corporal y lateralidad, por medio de juegos.",
                "4. Comunicar nuevas posibilidades de acción logradas a través de su cuerpo en situaciones cotidianas y de juego, empleando vocabulario preciso.",
                "5. Comunicar el bienestar que le produce el movimiento, al ejercitar y recrear su cuerpo en forma habitual, con y sin implementos u obstáculos.",
                "6. Coordinar con precisión y eficiencia sus habilidades psicomotrices finas en función de sus intereses de exploración y juego.",
                "7. Resolver desafíos prácticos manteniendo control, equilibrio y coordinación al combinar diversos movimientos, posturas y desplazamientos tales como: lanzar y recibir, desplazarse en planos inclinados, seguir ritmos, en una variedad de juegos.",
                "8. Coordinar sus habilidades psicomotoras practicando posturas y movimientos de fuerza, resistencia y tracción tales como: tirar la cuerda, transportar objetos, utilizar implementos, en situaciones cotidianas y de juego.",
                "9. Utilizar categorías de ubicación espacial y temporal, tales como: adelante/atrás/al lado/entre, día/noche, hoy/m mañana, antes/durante/después, en situaciones cotidianas y lúdicas."
        };
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_sciden; // Asegúrate de que este layout exista
    }
}