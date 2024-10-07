package com.example.tolist_de_aprendizaje;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ActivityScVerb extends ObjetivosBase {

    @Override
    protected String[] getObjectives() {
        return new String[]{
                "1. Expresar oralmente sus emociones y necesidades, a través de balbuceos, vocalizaciones y diversos recursos gestuales.",
                "2. Expresar oralmente sus necesidades e intereses, mediante la combinación de palabras y gestos, el uso de palabra-frase y progresivamente el empleo de frases simples.",
                "3. Identificar progresivamente la intención comunicativa de las distintas personas de su entorno a partir de sus expresiones verbales, no verbales y paraverbales.",
                "4. Comprender mensajes simples y breves en juegos y situaciones comunicativas cotidianas, respondiendo en forma gestual y corporal.",
                "5. Reconocer sonidos de diferentes fuentes sonoras de su entorno cotidiano, tales como objetos, artefactos, instrumentos musicales, animales, naturaleza.",
                "6. Incorporar nuevas palabras a su repertorio lingüístico para comunicarse con otros, en juegos y conversaciones.",
                "7. Disfrutar de distintos textos gráficos (libros de cuentos, láminas, entre otros) al manipularlos y observar sus imágenes.",
                "8. Comprender progresivamente, a partir de la escucha atenta, algunos contenidos explícitos de textos literarios y no literarios, respondiendo preguntas simples, en forma oral o gestual (¿qué es?, ¿quién es?, ¿dónde está?)."
        };
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_sciden; // Asegúrate de que este layout exista
    }
}