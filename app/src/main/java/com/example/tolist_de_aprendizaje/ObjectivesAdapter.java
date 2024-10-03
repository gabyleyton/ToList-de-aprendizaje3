package com.example.tolist_de_aprendizaje;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ObjectivesAdapter extends RecyclerView.Adapter<ObjectivesAdapter.ObjectiveViewHolder> {

    private String[] objectives;

    public ObjectivesAdapter(String[] objectives) {
        this.objectives = objectives;
    }

    @NonNull
    @Override
    public ObjectiveViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_objective, parent, false);
        return new ObjectiveViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ObjectiveViewHolder holder, int position) {
        holder.bind(objectives[position]);
    }

    @Override
    public int getItemCount() {
        return objectives.length;
    }

    static class ObjectiveViewHolder extends RecyclerView.ViewHolder {
        private TextView textViewObjective;

        public ObjectiveViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewObjective = itemView.findViewById(R.id.textview_objective);
        }

        public void bind(String objective) {
            textViewObjective.setText(objective);
        }
    }
}