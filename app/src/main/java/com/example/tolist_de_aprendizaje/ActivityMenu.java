package com.example.tolist_de_aprendizaje;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ActivityMenu extends AppCompatActivity {

    private ViewFlipper vf;
    private int[] image = {R.drawable.a, R.drawable.b, R.drawable.c};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        vf = (ViewFlipper) findViewById(R.id.slider);

        for (int i = 0; i < image.length; i++)
        {
            flip_image(image[i]);
        }

        vf.setFlipInterval(2800);
        vf.setAutoStart(true);

        vf.setInAnimation( this, android.R.anim.slide_in_left);
        vf.setOutAnimation( this, android.R.anim.slide_out_right);
    }

    public void flip_image(int i)
    {
        ImageView view = new ImageView( this);
        view.setBackgroundResource(i);
        vf.addView(view);

    }

}