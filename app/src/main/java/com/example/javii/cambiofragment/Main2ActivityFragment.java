package com.example.javii.cambiofragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class Main2ActivityFragment extends Fragment {

    TextView txt;
    View segundof;
    Button cerrar;

    public Main2ActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        segundof = inflater.inflate(R.layout.fragment_main2, container, false);
        txt = (TextView) segundof.findViewById(R.id.text);
        cerrar  = (Button) segundof.findViewById(R.id.Botoncerrar); //Boton recogido del framgmentu.
        cerrar.setOnClickListener(new View.OnClickListener(){
            //Para cerrar el metodo con el boton
            @Override
            public void onClick(View v) {
                getActivity().finish();
            }
        });
        return segundof;
    }

    public void cambiarTexto(String text){
        txt.setText(text);
    }
}
