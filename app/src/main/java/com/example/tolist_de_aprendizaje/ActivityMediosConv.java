package com.example.tolist_de_aprendizaje;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

public class ActivityMediosConv extends ObjetivosBase {

    @Override
    protected String[] getObjectives() {
        return new String[]{
                "1. Participar en actividades y juegos grupales con sus pares, conversando, intercambiando pertenencias, cooperando.",
                "2. Disfrutar de instancias de interacción social con diversas personas de la comunidad.",
                "3. Colaborar en situaciones cotidianas y de juego, proponiendo acciones simples frente a necesidades que presentan sus pares.",
                "4. Colaborar en actividades, conmemoraciones o celebraciones culturales de su familia y comunidad.",
                "5. Iniciarse en la resolución pacífica de conflictos, dialogando respecto de la situación, escuchando, opinando y proponiendo acciones para resolver.",
                "6. Manifestar disposición para practicar acuerdos de convivencia básica que regulan situaciones cotidianas y juegos.",
                "7. Identificar objetos, comportamientos y situaciones de riesgo que pueden atentar contra su seguridad, bienestar y el de los demás.",
                "8. Reconocer acciones correctas e incorrectas para la convivencia armónica del grupo, que se presentan en diferentes situaciones cotidianas y juegos.",
                "9. Manifestar interés por algunos de sus derechos, tales como: ser escuchados, tener un nombre, jugar, entre otros.",
                "10. Manifestar interés para interactuar con niños y niñas, reconociendo la diversidad de sus características y formas de vida (costumbres, fisonomía, lingüística, entre otras)."
        };
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_sciden; // Asegúrate de que este layout exista
    }
}