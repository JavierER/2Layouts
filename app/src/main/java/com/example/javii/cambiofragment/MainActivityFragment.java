package com.example.javii.cambiofragment;

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

    Button boton;
    View fragmento;
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
                    startActivity(intentPrincipal);

                }else {
                    Toast toast = Toast.makeText(getActivity(),"Estoy en LandScape", Toast.LENGTH_LONG);
                    toast.show();

                }
            }
        });
        return fragmento;
    }
}
