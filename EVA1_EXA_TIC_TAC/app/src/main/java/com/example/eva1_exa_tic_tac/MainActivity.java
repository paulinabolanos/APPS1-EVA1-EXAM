package com.example.eva1_exa_tic_tac;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnReiniciar;
    TextView txtVwTurno;
    Boolean casilla1, casilla2, casilla3, casilla4, casilla5, casilla6, casilla7, casilla8, casilla9;
    int turno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnReiniciar = findViewById(R.id.btnReiniciar);
        txtVwTurno = findViewById(R.id.txtVwTurno);
        btnReiniciar.setEnabled(false);
        turno = 1;

        casilla1 = false;
        casilla2 = false;
        casilla3 = false;
        casilla4 = false;
        casilla5 = false;
        casilla6 = false;
        casilla7 = false;
        casilla8 = false;
        casilla9 = false;

        btn1.setText("-");
        btn2.setText("-");
        btn3.setText("-");
        btn4.setText("-");
        btn5.setText("-");
        btn6.setText("-");
        btn7.setText("-");
        btn8.setText("-");
        btn9.setText("-");

        txtVwTurno.setText("Turno de X");

        btnReiniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                recreate();
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (turno == 1) {
                    turno = 2;
                    btn1.setText("X");
                    btn1.setTextColor(getResources().getColor(R.color.X));
                    txtVwTurno.setText("Turno de O");
                    btn1.setEnabled(false);

                } else if (turno == 2) {
                    turno = 1;
                    btn1.setText("O");
                    btn1.setTextColor(getResources().getColor(R.color.O));
                    txtVwTurno.setText("Turno de X");
                    btn1.setEnabled(false);
                }
                casilla1 = true;
                movs();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (turno == 1) {
                    turno = 2;
                    btn2.setText("X");
                    btn2.setTextColor(getResources().getColor(R.color.X));
                    txtVwTurno.setText("Turno de O");
                    btn2.setEnabled(false);

                } else if (turno == 2) {
                    turno = 1;
                    btn2.setText("O");
                    btn2.setTextColor(getResources().getColor(R.color.O));
                    txtVwTurno.setText("Turno de X");
                    btn2.setEnabled(false);
                }
                casilla2 = true;
                movs();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (turno == 1) {
                    turno = 2;
                    btn3.setText("X");
                    btn3.setTextColor(getResources().getColor(R.color.X));
                    txtVwTurno.setText("Turno de O");
                    btn3.setEnabled(false);

                } else if (turno == 2) {
                    turno = 1;
                    btn3.setText("O");
                    btn3.setTextColor(getResources().getColor(R.color.O));
                    txtVwTurno.setText("Turno de X");
                    btn3.setEnabled(false);
                }
                casilla3 = true;
                movs();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (turno == 1) {
                    turno = 2;
                    btn4.setText("X");
                    btn4.setTextColor(getResources().getColor(R.color.X));
                    txtVwTurno.setText("Turno de O");
                    btn4.setEnabled(false);

                } else if (turno == 2) {
                    turno = 1;
                    btn4.setText("O");
                    btn4.setTextColor(getResources().getColor(R.color.O));
                    txtVwTurno.setText("Turno de X");
                    btn4.setEnabled(false);
                }
                casilla4 = true;
                movs();
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (turno == 1) {
                    turno = 2;
                    btn5.setText("X");
                    btn5.setTextColor(getResources().getColor(R.color.X));
                    txtVwTurno.setText("Turno de O");
                    btn5.setEnabled(false);
                } else if (turno == 2) {
                    turno = 1;
                    btn5.setText("O");
                    btn5.setTextColor(getResources().getColor(R.color.O));
                    txtVwTurno.setText("Turno de X");
                    btn5.setEnabled(false);
                }
                casilla5 = true;
                movs();
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (turno == 1) {
                    turno = 2;
                    btn6.setText("X");
                    btn6.setTextColor(getResources().getColor(R.color.X));
                    txtVwTurno.setText("Turno de O");
                    btn6.setEnabled(false);

                } else if (turno == 2) {
                    turno = 1;
                    btn6.setText("O");
                    btn6.setTextColor(getResources().getColor(R.color.O));
                    txtVwTurno.setText("Turno de X");
                    btn6.setEnabled(false);
                }
                casilla6 = true;
                movs();
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (turno == 1) {
                    turno = 2;
                    btn7.setText("X");
                    btn7.setTextColor(getResources().getColor(R.color.X));
                    txtVwTurno.setText("Turno de O");
                    btn7.setEnabled(false);

                } else if (turno == 2) {
                    turno = 1;
                    btn7.setText("O");
                    btn7.setTextColor(getResources().getColor(R.color.O));
                    txtVwTurno.setText("Turno de X");
                    btn7.setEnabled(false);
                }
                casilla7 = true;
                movs();
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (turno == 1) {
                    turno = 2;
                    btn8.setText("X");
                    btn8.setTextColor(getResources().getColor(R.color.X));
                    txtVwTurno.setText("Turno de O");
                    btn8.setEnabled(false);

                } else if (turno == 2) {
                    turno = 1;
                    btn8.setText("O");
                    btn8.setTextColor(getResources().getColor(R.color.O));
                    txtVwTurno.setText("Turno de X");
                    btn8.setEnabled(false);
                }
                casilla8 = true;
                movs();
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (turno == 1) {
                    turno = 2;
                    btn9.setText("X");
                    btn9.setTextColor(getResources().getColor(R.color.X));
                    txtVwTurno.setText("Turno de O");
                    btn9.setEnabled(false);

                } else if (turno == 2) {
                    turno = 1;
                    btn9.setText("O");
                    btn9.setTextColor(getResources().getColor(R.color.O));
                    txtVwTurno.setText("Turno de X");
                    btn9.setEnabled(false);
                }
                casilla9 = true;
                movs();

            }
        });
    }
    public void movs() {

        String var1, var2, var3, var4, var5, var6, var7, var8, var9;

        boolean fin = false;

        String ganador = "";

        var1 = btn1.getText().toString();
        var2 = btn2.getText().toString();
        var3 = btn3.getText().toString();
        var4 = btn4.getText().toString();
        var5 = btn5.getText().toString();
        var6 = btn6.getText().toString();
        var7 = btn7.getText().toString();
        var8 = btn8.getText().toString();
        var9 = btn9.getText().toString();

        if (var1.equals("X") && var2.equals("X") && var3.equals("X")) {
            txtVwTurno.setText("GANA X");
            ganador = "X";
            Toast.makeText(this, "GANA X", Toast.LENGTH_LONG).show();
            fin = true;
        }
        if (var1.equals("X") && var5.equals("X") && var9.equals("X")) {
            txtVwTurno.setText("GANA X");
            ganador = "X";
            Toast.makeText(this, "GANA X", Toast.LENGTH_LONG).show();
            fin = true;
        }
        if (var1.equals("X") && var4.equals("X") && var7.equals("X")) {
            txtVwTurno.setText("GANA X");
            ganador = "X";
            Toast.makeText(this, "GANA X", Toast.LENGTH_LONG).show();
            fin = true;
        }
        if (var2.equals("X") && var5.equals("X") && var8.equals("X")) {
            txtVwTurno.setText("GANA X");
            ganador = "X";
            Toast.makeText(this, "GANA X", Toast.LENGTH_LONG).show();
            fin = true;
        }
        if (var3.equals("X") && var6.equals("X") && var9.equals("X")) {
            txtVwTurno.setText("GANA X");
            ganador = "X";
            Toast.makeText(this, "GANA X", Toast.LENGTH_LONG).show();
            fin = true;
        }
        if (var4.equals("X") && var5.equals("X") && var6.equals("X")) {
            txtVwTurno.setText("GANA X");
            ganador = "X";
            Toast.makeText(this, "GANA X", Toast.LENGTH_LONG).show();
            fin = true;
        }
        if (var7.equals("X") && var8.equals("X") && var9.equals("X")) {
            txtVwTurno.setText("GANA X");
            ganador = "X";
            Toast.makeText(this, "GANA X", Toast.LENGTH_LONG).show();
            fin = true;
        }
        if (var3.equals("X") && var5.equals("X") && var7.equals("X")) {
            txtVwTurno.setText("GANA X");
            ganador = "X";
            Toast.makeText(this, "GANA X", Toast.LENGTH_LONG).show();
            fin = true;
        }
        if (var1.equals("O") && var2.equals("O") && var3.equals("O")) {
            txtVwTurno.setText("GANA O");
            ganador = "O";
            Toast.makeText(this, "GANA O", Toast.LENGTH_LONG).show();
            fin = true;
        }
        if (var1.equals("O") && var5.equals("O") && var9.equals("O")) {
            txtVwTurno.setText("GANA O");
            ganador = "O";
            Toast.makeText(this, "GANA O", Toast.LENGTH_LONG).show();
            fin = true;
        }
        if (var1.equals("O") && var4.equals("O") && var7.equals("O")) {
            txtVwTurno.setText("GANA O");
            ganador = "O";
            Toast.makeText(this, "GANA O", Toast.LENGTH_LONG).show();
            fin = true;
        }
        if (var2.equals("O") && var5.equals("O") && var8.equals("O")) {
            txtVwTurno.setText("GANA O");
            ganador = "O";
            Toast.makeText(this, "GANA O", Toast.LENGTH_LONG).show();
            fin = true;
        }
        if (var3.equals("O") && var6.equals("O") && var9.equals("O")) {
            txtVwTurno.setText("GANA O");
            ganador = "O";
            Toast.makeText(this, "GANA O", Toast.LENGTH_LONG).show();
            fin = true;
        }
        if (var4.equals("O") && var5.equals("O") && var6.equals("O")) {
            txtVwTurno.setText("GANA O");
            ganador = "O";
            Toast.makeText(this, "GANA O", Toast.LENGTH_LONG).show();
            fin = true;
        }
        if (var7.equals("O") && var8.equals("O") && var9.equals("O")) {
            txtVwTurno.setText("GANA O");
            ganador = "O";
            Toast.makeText(this, "GANA O", Toast.LENGTH_LONG).show();
            fin = true;
        }
        if (var3.equals("O") && var5.equals("O") && var7.equals("O")) {
            txtVwTurno.setText("GANA O");
            ganador = "O";
            Toast.makeText(this, "GANA O", Toast.LENGTH_LONG).show();
            fin = true;
        }
        if (casilla1 == true)
            if (casilla2 == true)
                if (casilla3 == true)
                    if (casilla4 == true)
                        if (casilla5 == true)
                            if (casilla6 == true)
                                if (casilla7 == true)
                                    if (casilla8 == true)
                                        if (casilla9 == true) {
                                            txtVwTurno.setText("EMPATE");
                                            ganador = "EMPATE";
                                            Toast.makeText(this, ganador, Toast.LENGTH_LONG).show();
                                            fin = true;
                                        }

        if (fin) {
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);

            btnReiniciar.setEnabled(true);

            if (ganador.equals("O") | ganador.equals("X")) {
                new AlertDialog.Builder(this)
                        .setTitle("Fin del juego, Ha ganado" + "\" " + ganador + " \"")
                        .setMessage("¿Volver a jugar?")
                        .setPositiveButton("Si", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                recreate();
                            }

                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                btnReiniciar.setEnabled(true);
                            }
                        })
                        .show();
            } else {
                new AlertDialog.Builder(this)
                        .setTitle("Fin del juego, EMPATE")
                        .setMessage("¿Volver a jugar?")
                        .setPositiveButton("Si", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                recreate();
                            }

                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                btnReiniciar.setEnabled(true);
                            }
                        })
                        .show();
            }

        }
    }
}
