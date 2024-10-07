package com.example.tolist_de_aprendizaje;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ActivityMediosCorp extends ObjetivosBase {

    @Override
    protected String[] getObjectives() {
        return new String[]{
                "1. Reconocer situaciones en que se siente cómodo corporalmente, manifestando al adulto su bienestar y su interés por mantener estas condiciones.",
                "2. Reconocer las principales partes, características físicas de su cuerpo y sus funciones en situaciones cotidianas y de juego.",
                "3. Experimentar diversas posibilidades de acción con su cuerpo, en situaciones cotidianas y de juego, identificando progresivamente el vocabulario asociado.",
                "4. Reconocer el bienestar que le produce el movimiento libre en situaciones cotidianas y lúdicas, manifestando su interés por desarrollarlo en forma frecuente.",
                "5. Perfeccionar su coordinación visomotriz fina, a través del uso de diversos objetos, juguetes y utensilios.",
                "6. Adquirir control y equilibrio en movimientos, posturas y desplazamientos que realiza en diferentes direcciones y en variadas situaciones cotidianas y juegos, con y sin implementos.",
                "7. Resolver desafíos prácticos en situaciones cotidianas y juegos, incorporando mayor precisión y coordinación en la realización de posturas, movimientos y desplazamientos, tales como: esquivar obstáculos o mantener equilibrio al subir escalas.",
                "8. Utilizar categorías de ubicación espacial y temporal, tales como: adelante/atrás, arriba/abajo, adentro/afuera, antes/después, rápido/lento, en situaciones cotidianas y lúdicas."
        };
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_sciden; // Asegúrate de que este layout exista
    }
}