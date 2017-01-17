package com.example.javii.cambiofragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements MainActivityFragment.Comunicador{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void mensaje(String texto) {
        Main2ActivityFragment segundof = (Main2ActivityFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentLand);
        if (segundof != null) {
            segundof.cambiarTexto(texto);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    protected void onActivityResult (int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        //Se comprueba si el resultCode es igual que el de el startActivity.
        if (requestCode == 1) {
            if (resultCode == RESULT_OK){
                TextView textv = (TextView) findViewById(R.id.textocomprobar);
                String respuesta = data.getStringExtra("Vuelta");
                textv.setText(respuesta);
            }

        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
