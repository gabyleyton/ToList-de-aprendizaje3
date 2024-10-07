package com.example.tolist_de_aprendizaje;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ActivityMediosVerb extends ObjetivosBase {

    @Override
    protected String[] getObjectives() {
        return new String[]{
                "1. Expresarse oralmente, empleando estructuras oracionales simples y respetando patrones gramaticales básicos, en distintas situaciones cotidianas y juegos.",
                "2. Comprender mensajes simples como instrucciones explícitas, explicaciones y preguntas relativas a objetos, personas, acciones, tiempo y lugar, identificando la intencionalidad comunicativa de diversos interlocutores.",
                "3. Identificar algunos atributos de los sonidos de diferentes fuentes sonoras como intensidad (fuerte/suave), velocidad (rápido/lento).",
                "4. Incorporar progresivamente nuevas palabras, al comunicar oralmente temas variados de su interés e información básica, en distintas situaciones cotidianas.",
                "5. Manifestar interés por descubrir el contenido de textos de diferentes formatos, a través de la manipulación, la exploración, la escucha atenta y la formulación de preguntas.",
                "6. Comprender a partir de la escucha atenta, contenidos explícitos de textos literarios y no literarios, reconociendo ideas centrales, señalando preferencias, realizando sencillas descripciones, preguntando sobre el contenido.",
                "7. Reconocer progresivamente el significado de diversas imágenes, logos, símbolos de su entorno cotidiano, en diversos soportes (incluye uso de TICs).",
                "8. Producir sus propios signos gráficos en situaciones lúdicas."
        };
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_sciden; // Asegúrate de que este layout exista
    }
}