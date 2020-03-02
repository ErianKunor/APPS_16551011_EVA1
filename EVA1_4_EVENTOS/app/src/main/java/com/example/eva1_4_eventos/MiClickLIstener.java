package com.example.eva1_4_eventos;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class MiClickLIstener implements View.OnClickListener {

    Context context;

    public MiClickLIstener(Context context){
        this.context = context;

    }

    @Override
    public void onClick(View v) {
        Toast.makeText(context,"Evento POR CLASE ANONIMA", Toast.LENGTH_LONG).show();
        }
    }
}
