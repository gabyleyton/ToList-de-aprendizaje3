package com.example.tolist_de_aprendizaje;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public abstract class ObjetivosBase extends AppCompatActivity { // Debe extender de AppCompatActivity

    protected RecyclerView recyclerViewObjectives;
    protected ObjectivesAdapter objectivesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());

        recyclerViewObjectives = findViewById(R.id.recycler_view_objectives);
        recyclerViewObjectives.setLayoutManager(new LinearLayoutManager(this));
        String[] objectives = getObjectives();
        objectivesAdapter = new ObjectivesAdapter(objectives);
        recyclerViewObjectives.setAdapter(objectivesAdapter);
    }

    // Método abstracto para que las subclases lo implementen
    protected abstract String[] getObjectives();

    // Método abstracto para que las subclases especifiquen su layout
    protected abstract int getLayoutId();
}
