package com.example.calc_vol;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final SeekBar seekBar1;
        seekBar1 = findViewById(R.id.seekBar1);
        final EditText edtTxtRadio = findViewById(R.id.edtTxtRadio);

        Button btnCalcular = findViewById(R.id.btnCalcular);

        final TextView textViewProg = findViewById(R.id.textViewProg);

        seekBar1.setMax(360);
        seekBar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar1, int progress, boolean fromUser) {
                textViewProg.setText("" + progress);
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

        //PARA CALCULAR AL PRESIONAR EL BOTON
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            String valor = edtTxtRadio.getText().toString();
            int radio = Integer.parseInt(valor);
            int angulo = seekBar1.getProgress();
            double volumen = 0.666666667 * (angulo*(Math.pow(radio,3)));

            // 2/3 = 0.666666667


            Toast.makeText(MainActivity.this, "El volumen es: " + volumen, Toast.LENGTH_SHORT).show();
            }
        });

    }

    //PARA OCULTAR EL TECLADO
    public void hideKeyboard(View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
}

