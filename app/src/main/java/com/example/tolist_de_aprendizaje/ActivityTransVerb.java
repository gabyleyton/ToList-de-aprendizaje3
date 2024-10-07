package com.example.tolist_de_aprendizaje;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ActivityTransVerb extends ObjetivosBase {

    @Override
    protected String[] getObjectives() {
        return new String[]{
                "1. Expresarse oralmente en forma clara y comprensible, empleando estructuras oracionales completas, conjugaciones verbales adecuadas y precisas con los tiempos, personas e intenciones comunicativas.",
                "2. Comprender textos orales como preguntas, explicaciones, relatos, instrucciones y algunos conceptos abstractos en distintas situaciones comunicativas, identificando la intencionalidad comunicativa de diversos interlocutores.",
                "3. Descubrir en contextos lúdicos, atributos fonológicos de palabras conocidas, tales como conteo de palabras, segmentación y conteo de sílabas, identificación de sonidos finales e iniciales.",
                "4. Comunicar oralmente temas de su interés, empleando un vocabulario variado e incorporando palabras nuevas y pertinentes a las distintas situaciones comunicativas e interlocutores.",
                "5. Manifestar interés por descubrir el contenido y algunos propósitos de diferentes textos escritos (manipulando, explorando, realizando descripciones y conjeturas) a través del contacto cotidiano con algunos de ellos, o del uso de TICs.",
                "6. Comprender contenidos explícitos de textos literarios y no literarios, a partir de la escucha atenta, describiendo información y realizando progresivamente inferencias y predicciones.",
                "7. Reconocer palabras que se encuentran en diversos soportes asociando algunos fonemas a sus correspondientes grafemas.",
                "8. Representar gráficamente algunos trazos, letras, signos, palabras significativas y mensajes simples legibles, utilizando diferentes recursos y soportes en situaciones auténticas.",
                "9. Comunicar mensajes simples en la lengua indígena pertinente a la comunidad donde habita.",
                "10. Reconocer algunas palabras o mensajes sencillos de lenguas maternas de sus pares, distintas al castellano."
        };
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_sciden; // Asegúrate de que este layout exista
    }
}