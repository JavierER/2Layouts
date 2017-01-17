package com.example.javii.cambiofragment;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    Comunicador comunicador;

    public interface Comunicador{
        public void mensaje(String texto);
    }

    public void onAttach(Context contexto){
        super.onAttach(contexto);
        comunicador = (Comunicador)contexto;
    }

    Button boton;
    View fragmento;
    final static String texto = "Vacaciones de primavera";

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        fragmento = inflater.inflate(R.layout.fragment_main, container, false);
        boton = (Button) fragmento.findViewById(R.id.botoncambio);
        boton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                if(getResources().getBoolean(R.bool.pantallas)){
                    Toast toast = Toast.makeText(getActivity(),"Estoy en Portrait", Toast.LENGTH_LONG);
                    toast.show();
                    Intent intentPrincipal = new Intent(getActivity(), Main2Activity.class);
                    intentPrincipal.putExtra(MainActivityFragment.texto, "Hola tts");
                    startActivityForResult(intentPrincipal, 1);


                }else {
                    Toast toast = Toast.makeText(getActivity(),"Estoy en LandScape", Toast.LENGTH_LONG);
                    toast.show();
                    comunicador.mensaje("Hola tts");
                }
            }
        });
        return fragmento;
    }
}
