package com.example.eva1_11_clima;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

ListView lstVwClima;
ImageView imgVwClima;
TextView txtVwCity, txtVwTemp, txtVwDesc;



Weather[] cities = {

        new Weather("Chihuahua", 20, "Nublado con lluvias ligeras", R.drawable.light_rain),
        new Weather("Delicias", 15, "Nublado", R.drawable.cloudy),
        new Weather("Torreon", 30, "Soleado", R.drawable.sunny),
        new Weather("Ciudad Juarez", -3, "Nevando", R.drawable.snow),
        new Weather("Jimenez", 23, "Lluvias fuertes", R.drawable.rainy),
        new Weather("Camargo", 0, "Tornaddo peligro inminente", R.drawable.tornado)

};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lstVwClima = findViewById(R.id.lstVwClima);
        lstVwClima.setAdapter((new WeatherAdapter(this, R.layout.mi_layout,cities)));
        imgVwClima = findViewById(R.id.imgVwClima);
        txtVwCity = findViewById(R.id.txtVwCity);
        txtVwTemp = findViewById(R.id.txtVwTemp);
        txtVwDesc = findViewById(R.id.txtVwDesc);

    }
}
