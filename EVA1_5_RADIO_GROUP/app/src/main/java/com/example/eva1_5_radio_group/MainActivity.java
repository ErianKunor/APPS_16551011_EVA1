package com.example.eva1_5_radio_group;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener{
    RadioGroup comida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        comida = findViewById(R.id.comida);

        comida.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        //checkedID  --> es el id del radiobutton seleccionado
        //findviewbyid --> regresa el view usando el id

        RadioButton radBtnChd = findViewById(checkedId);
        Toast.makeText(this,radBtnChd.getText(),Toast.LENGTH_SHORT).show();
    }
}
