package com.example.tolist_de_aprendizaje;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ActivityTransConv extends ObjetivosBase {

    @Override
    protected String[] getObjectives() {
        return new String[]{
                "1. Participar en actividades y juegos colaborativos, planificando, acordando estrategias para un propósito común y asumiendo progresivamente responsabilidades en ellos.",
                "2. Participar en actividades solidarias, que integran a las familias, la comunidad educativa y local.",
                "3. Manifestar empatía y solidaridad frente a situaciones que vivencian sus pares, o que observa en textos o TICs, practicando acciones de escucha, apoyo y colaboración.",
                "4. Apreciar el significado que tienen para las personas y las comunidades, diversas manifestaciones culturales que se desarrollan en su entorno.",
                "5. Aplicar estrategias pacíficas frente a la resolución de conflictos cotidianos con otros niños y niñas.",
                "6. Respetar normas y acuerdos creados colaborativamente con pares y adultos, para el bienestar del grupo.",
                "7. Identificar objetos, comportamientos y situaciones de riesgo que pueden atentar contra su bienestar y seguridad, o la de los demás, proponiendo alternativas para enfrentarlas.",
                "8. Comprender que algunas de sus acciones y decisiones respecto al desarrollo de juegos y proyectos colectivos, influyen en las de sus pares.",
                "9. Reconocer, y progresivamente hacer respetar el derecho a expresarse libremente, a ser escuchado y a que su opinión sea tomada en cuenta.",
                "10. Reconocer progresivamente requerimientos esenciales de las prácticas de convivencia democrática, tales como: escucha de opiniones divergentes, el respeto por los demás, de los turnos, de los acuerdos de las mayorías.",
                "11. Apreciar la diversidad de las personas y sus formas de vida, tales como: singularidades fisonómicas, lingüísticas, religiosas, de género, entre otras."
        };
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_sciden; // Asegúrate de que este layout exista
    }
}