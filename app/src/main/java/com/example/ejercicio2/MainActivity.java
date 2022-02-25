package com.example.ejercicio2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    Button arriba;
    Button abajo;
    Button derecha;
    Button izquierda;
    Button salir3;
    TextView cero;
    int x = 0;
    int y = 0;

    private void moveBall() {
        x = x + 1;
        y = y + 1;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arriba    = (Button)findViewById(R.id.b1);
        abajo     = (Button)findViewById(R.id.b4);
        derecha   = (Button)findViewById(R.id.b2);
        izquierda = (Button)findViewById(R.id.b3);
        salir3    = (Button)findViewById(R.id.b5);
        cero      = (TextView)findViewById(R.id.c1);

        int[] Cordenadas = new int[]{0, 0};
        cero.setText(Arrays.toString(Cordenadas));

        arriba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cordenadas[1]++;
                cero.setText(Arrays.toString(Cordenadas));
            }
        });

        derecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cordenadas[0]++;
                cero.setText(Arrays.toString(Cordenadas));

            }
        });

        izquierda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cordenadas[0]--;
                cero.setText(Arrays.toString(Cordenadas));

            }
        });

        abajo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cordenadas[1]--;
                cero.setText(Arrays.toString(Cordenadas));

            }
        });

        salir3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(MainActivity.this, MainActivity.class));

            }
        });

    }
}

