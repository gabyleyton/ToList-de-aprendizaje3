package com.example.tolist_de_aprendizaje;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ActivityTransIden extends ObjetivosBase {

    @Override
    protected String[] getObjectives() {
        return new String[]{
                "1. Comunicar a los demás, emociones y sentimientos tales como: amor, miedo, alegría, ira, que le provocan diversas narraciones o situaciones observadas en forma directa o a través de TICs.",
                "2. Manifestar disposición y confianza para relacionarse con algunos adultos y pares que no son parte del grupo o curso.",
                "3. Reconocer emociones y sentimientos en otras personas, observadas en forma directa o a través de TICs.",
                "4. Expresar sus emociones y sentimientos autorregulándose en función de las necesidades propias, de los demás y las normas de funcionamiento grupal.",
                "5. Comunicar sus preferencias, opiniones, ideas, en diversas situaciones cotidianas y juegos.",
                "6. Planificar proyectos y juegos, en función de sus ideas e intereses, proponiendo actividades, organizando los recursos, incorporando los ajustes necesarios e iniciándose en la apreciación de sus resultados.",
                "7. Comunicar rasgos de su identidad de género, roles (nieta/o, vecino/a, entre otros), sentido de pertenencia y cualidades personales.",
                "8. Comunicar sus características identitarias, fortalezas, habilidades y desafíos personales.",
                "9. Cuidar su bienestar personal, llevando a cabo sus prácticas de higiene, alimentación y vestuario, con independencia y progresiva responsabilidad.",
                "10. Comunicar a otras personas desafíos alcanzados, identificando acciones que aportaron a su logro y definiendo nuevas metas.",
                "11. Distinguir parámetros establecidos para la regulación de alimentos, tales como: etiquetado de sellos, fechas de vencimiento, entre otros.",
                "12. Anticipar acciones y prever algunas situaciones o desafíos que se pueden presentar, en juegos, proyectos, sucesos que experimenta o que observa a través de TICs.",
                "13. Representar en juegos sociodramáticos, sus pensamientos y experiencias atribuyendo significados a objetos, personas y situaciones."
        };
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_medios_iden; // Asegúrate de que este layout exista
    }
}