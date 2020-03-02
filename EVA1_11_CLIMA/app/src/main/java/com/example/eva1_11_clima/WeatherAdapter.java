package com.example.eva1_11_clima;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class WeatherAdapter extends ArrayAdapter<Weather> {

    private Weather[] objects;
    private Context context;
    private int resource;

    public WeatherAdapter(@NonNull Context context, int resource, @NonNull Weather[] objects) {
        super(context, resource, objects);
        this.objects = objects;
        this.context = context;
        this.resource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        //CONVERVIEW REPRESENTA MI LAYOUT
        if (convertView==null) {//PRIMERA VEZ, HAY QUE CREAR EL LAYOUT
            convertView = ((Activity)context).getLayoutInflater().inflate(resource, parent, false);

        }

        //RECUPERANDO COMPONENTES

        ImageView imgVwClima;
        TextView txtVwCity, txtVwTemp, txtVwDesc;
        imgVwClima = convertView.findViewById(R.id.imgVwClima);
        txtVwCity = convertView.findViewById(R.id.txtVwCity);
        txtVwTemp = convertView.findViewById(R.id.txtVwTemp);
        txtVwDesc = convertView.findViewById(R.id.txtVwDesc);

        imgVwClima.setImageResource(objects[position].getImage());
        txtVwCity.setText(objects[position].getCity());
        txtVwTemp.setText("" + objects[position].getTemp());
        txtVwDesc.setText(objects[position].getDesc());



        return convertView;
    }
}
