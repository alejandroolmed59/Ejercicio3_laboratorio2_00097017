package com.example.paneles;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private LinearLayout layoutRojo;
    private LinearLayout layoutAzul;
    private LinearLayout layoutVerde;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layoutRojo= findViewById(R.id.rojo);
        layoutAzul= findViewById(R.id.azul);
        layoutVerde= findViewById(R.id.verde);



        layoutRojo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int numero =(int)(Math.random()*184)+70;
                layoutRojo.setBackgroundColor(Color.rgb(numero,0,0));
            }
        });
        layoutVerde.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int numero =(int)(Math.random()*184)+70;
                layoutVerde.setBackgroundColor(Color.rgb(0,numero,0));
            }
        });
        layoutAzul.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int numero =(int)(Math.random()*184)+70;
                layoutAzul.setBackgroundColor(Color.rgb(0,0,numero));
            }
        });
    }
}
