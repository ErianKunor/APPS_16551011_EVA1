package com.example.eva1_2_layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edtTxtNom, edtTxtApe, edtTxtEdad;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //CONECTAR COMPONENTES:
        edtTxtNom = findViewById(R.id.edtTxtApe);
        edtTxtApe = findViewById(R.id.edtTxtApe);
        edtTxtEdad = findViewById(R.id.edtTxtEdad);
        edtTxtApe.setText("Hola Mundo");
    }
}
