package com.example.eva1_exa_acre_noacre;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtVwNomb, txtVwNoControl, txtVwPuntos, txtVwCalif, txtVwEdo;
    SeekBar skBrPuntos, skBrCalif;
    int puntos = 70;
    int calif = 70;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtVwNomb = findViewById(R.id.txtVwNomb);
        txtVwNoControl = findViewById(R.id.txtVwNoControl);
        txtVwPuntos = findViewById(R.id.txtVwPuntos);
        txtVwCalif = findViewById(R.id.txtVwCalif);
        txtVwEdo = findViewById(R.id.txtVwEdo);
        skBrPuntos = findViewById(R.id.skBrPuntos);
        skBrCalif = findViewById(R.id.skBrCalif);

        txtVwNomb.setText("Paulina Adriana Bolaños Estrada");
        txtVwNoControl.setText("16550405");

        skBrCalif.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                calif = progress * 1;
                txtVwCalif.setText("Calificacion: " + String.valueOf(calif));
                if (calif < puntos) {
                    txtVwEdo.setText("REPROBADO!!!");
                    txtVwEdo.setTextColor(Color.parseColor("#EF280F"));
                } else {
                    txtVwEdo.setText("ACREDITADO!!!");
                    txtVwEdo.setTextColor(Color.parseColor("#02AC66"));
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

         skBrPuntos.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                puntos = progress * 1;
                txtVwPuntos.setText("Puntos para creditar: " + String.valueOf(puntos));
                if (calif < puntos) {
                    txtVwEdo.setText("REPROBADO!!!");
                    txtVwEdo.setTextColor(Color.parseColor("#EF280F"));
                } else {
                    txtVwEdo.setText("ACREDITADO!!!");
                    txtVwEdo.setTextColor(Color.parseColor("#02AC66"));
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
}
