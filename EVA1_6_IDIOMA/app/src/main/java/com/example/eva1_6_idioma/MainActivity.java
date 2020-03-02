package com.example.eva1_6_idioma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
implements RadioGroup.OnCheckedChangeListener{
    RadioGroup radGpIdioma;
    RadioButton radBtnESP, radBtnENG;
    TextView txtVwNom, txtVwApe, txtVwEdad, txtVwIdioma;
    EditText edTxtNom, edTxtAPe, edTxtEdad;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //OPCIONES
        radGpIdioma = findViewById(R.id.radGpIdioma);
        radBtnESP = findViewById(R.id.radBtnEsp);
        radBtnENG = findViewById(R.id.radBtnEng);

        //TEXTVIEWS
        txtVwNom = findViewById(R.id.txtVwNom);
        txtVwApe = findViewById(R.id.txtVwApe);
        txtVwEdad = findViewById(R.id.txtVwEdad);
        txtVwIdioma = findViewById(R.id.txtVwIdioma);

        //EDITEXTS
        edTxtNom = findViewById(R.id.edTxtNom);
        edTxtAPe = findViewById(R.id.edTxtApe);
        edTxtEdad = findViewById(R.id.edTxtEdad);

        radGpIdioma.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {

        if(checkedId == R.id.radBtnEsp){
            txtVwIdioma.setText(R.string.idioma_es);
            radBtnESP.setText(R.string.espanol_es);
            radBtnENG.setText(R.string.ingles_es);
            txtVwNom.setText(R.string.txt_nombre_es);
            txtVwApe.setText(R.string.txt_apellido_es);
            txtVwEdad.setText(R.string.txt_edad_es);
            edTxtNom.setText(R.string.hint_nombre_es);
            edTxtAPe.setText(R.string.hint_apellido_es);


        }else{

            txtVwIdioma.setText(R.string.idioma_ns);
        }

    }
}
