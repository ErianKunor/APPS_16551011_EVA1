package com.example.eva1_4_eventos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
implements View.OnClickListener{


    Button btnListener;
    Button btnClaseAnonima;
    Button btnPorClase;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnListener = findViewById(R.id.btnLIstener);
        btnClaseAnonima = findViewById(R.id.btnClaseAnonima);
        btnPorClase = findViewById(R.id.btnPorClase);


        btnListener.setOnClickListener(this);
        btnClaseAnonima.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Evento POR CLASE ANONIMA", Toast.LENGTH_LONG).show();
            }
        });

        btnPorClase.setOnClickListener(new MiClickLIstener(getApplicationContext()));
    }

    public void miClick(View v){
        Toast.makeText(this,"Evento POR XMl", Toast.LENGTH_LONG).show();
    }


    @Override
    public void onClick(View v) {
        Toast.makeText(this,"Evento POR LISTENER", Toast.LENGTH_LONG).show();

    }
}
