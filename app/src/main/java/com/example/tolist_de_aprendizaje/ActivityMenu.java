package com.example.tolist_de_aprendizaje;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityMenu extends AppCompatActivity {

    private ViewFlipper vf;
    private int[] image = {R.drawable.a, R.drawable.b, R.drawable.c};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        vf = findViewById(R.id.slider);

        for (int i = 0; i < image.length; i++) {
            flip_image(image[i]);
        }

        vf.setFlipInterval(2800);
        vf.setAutoStart(true);
        vf.setInAnimation(this, android.R.anim.slide_in_left);
        vf.setOutAnimation(this, android.R.anim.slide_out_right);


        Button DesaBtn = findViewById(R.id.DesaBtn);
        DesaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityMenu.this, Activity_IyA.class);
                startActivity(intent);
            }
        });
    }

    public void flip_image(int i) {
        ImageView view = new ImageView(this);
        view.setBackgroundResource(i);
        vf.addView(view);
    }
}