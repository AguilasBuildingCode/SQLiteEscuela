package com.developers.xsquad.sqliteescuela;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView info;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        info =(TextView)findViewById(R.id.tvMensaje2);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                 //       .setAction("Action", null).show();
                info.setText("Se presionó boton flotante");
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.Agregar:
                info.setText("Se presionó Añadir");
                return true;

            case R.id.Buscar:
                info.setText("Se presionó Buscar");
                return true;

            case R.id.Editar:
                info.setText("Se presionó Editar");
                return true;

            case R.id.Eliminar:
                info.setText("Se presionó Eliminar");
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void Cambiar(View view){
        info.setText("Se precionó Cambiar");
    }
}
