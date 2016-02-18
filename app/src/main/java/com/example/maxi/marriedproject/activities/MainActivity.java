package com.example.maxi.marriedproject.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.maxi.marriedproject.R;


public class MainActivity extends ActionBarActivity {

    private Button btnNovios;
    private Button btnInvitados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnInvitados = (Button) findViewById(R.id.btnInvitados);
        btnNovios = (Button) findViewById(R.id.btnNovios);

        btnNovios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), "Son novios", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getBaseContext(), ActivityNovios.class);
                startActivity(intent);
            }
        });

        btnInvitados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), "Son invitados", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getBaseContext(), ActiviyInvitados.class);
                startActivity(intent);
            }
        });
    }

}
