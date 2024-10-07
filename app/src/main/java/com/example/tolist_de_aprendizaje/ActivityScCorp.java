package com.example.tolist_de_aprendizaje;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ActivityScCorp extends ObjetivosBase {

    @Override
    protected String[] getObjectives() {
        return new String[]{
                "1. Manifestar su agrado, al sentirse cómodo, seguro y contenido corporalmente.",
                "2. Descubrir partes de su cuerpo y algunas de sus características físicas, a través de diversas experiencias sensoriomotrices.",
                "3. Manifestar interés y satisfacción al moverse libremente en situaciones cotidianas y lúdicas.",
                "4. Ampliar sus posibilidades de exploración sensoriomotriz, adquiriendo control de la prensión palmar voluntaria (toma objetos, se pasa objetos de una mano a otra, entre otros) y la postura sedente.",
                "5. Adquirir desplazamiento gradual en sus distintas formas (girar, reptar, ponerse de pie, caminar), para disfrutar la ampliación de sus posibilidades de movimiento, exploración y juego.",
                "6. Coordinar movimientos de manipulación ubicando objetos en relación a su propio cuerpo, tales como: acercar objetos pequeños utilizando índice y pulgar en oposición.",
                "7. Explorar la alternancia de posturas y movimientos en acciones tales como: trepar, lanzar objetos o hacer ronda, adquiriendo control gradual de su cuerpo al jugar."
        };
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_sciden; // Asegúrate de que este layout exista
    }
}