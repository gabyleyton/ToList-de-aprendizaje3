package com.example.tolist_de_aprendizaje;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ActivityMediosIden extends ObjetivosBase {

    @Override
    protected String[] getObjectives() {
        return new String[]{
                "1. Representar verbal y corporalmente diferentes emociones y sentimientos, en sus juegos.",
                "2. Manifestar disposición y confianza al separarse de los adultos significativos.",
                "3. Reconocer en sí mismo, en otras personas y en personajes de cuentos, emociones tales como: tristeza, miedo, alegría, pena y rabia.",
                "4. Manifestar disposición para regular sus emociones y sentimientos, en función de las necesidades propias, de los demás y de algunos acuerdos para el funcionamiento grupal.",
                "5. Manifestar sus preferencias cuando participa o cuando solicita participar, en diversas situaciones cotidianas y juegos.",
                "6. Actuar con progresiva independencia, ampliando su repertorio de acciones, acorde a sus necesidades e intereses.",
                "7. Comunicar algunos rasgos de su identidad, como su nombre, sus características corporales, género y otros.",
                "8. Apreciar sus características identitarias, fortalezas y habilidades.",
                "9. Manifestar progresiva independencia en sus prácticas de alimentación, vigilia y sueño, vestimenta, higiene corporal, bucal y evacuación.",
                "10. Manifestar satisfacción y confianza por su autovalía, comunicando algunos desafíos alcanzados, tales como: saltar, hacer torres, sacar cáscara de huevos, entre otros.",
                "11. Identificar alimentos que se consumen en algunas celebraciones propias de su familia y comunidad.",
                "12. Representar sus pensamientos y experiencias, atribuyendo significados a objetos o elementos de su entorno, usando la imaginación en situaciones de juego."
        };
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_medios_iden; // Asegúrate de que este layout exista
    }
}