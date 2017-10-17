package com.gdandroidbolivia.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.StringCharacterIterator;

public class MainActivity extends AppCompatActivity {
     Button bt0,bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bti,btsuma,btresta,btmulti,btdivi,btAc;
    EditText stproce,stconcatenar;
    int nro1=0,nro2=0,resultado=0;
    String operador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt0=(Button) findViewById(R.id.cero);
        bt1=(Button) findViewById(R.id.b1);
        bt2=(Button) findViewById(R.id.b2);
        bt3=(Button) findViewById(R.id.b3);
        bt4=(Button) findViewById(R.id.b4);
        bt5=(Button) findViewById(R.id.b5);
        bt6=(Button) findViewById(R.id.b6);
        bt7=(Button) findViewById(R.id.b7);
        bt8=(Button) findViewById(R.id.b8);
        bt9=(Button) findViewById(R.id.b9);
        bti=(Button) findViewById(R.id.igual);
        btsuma=(Button) findViewById(R.id.suma);
        btresta=(Button) findViewById(R.id.resta);
        btmulti=(Button) findViewById(R.id.multi);
        btdivi=(Button) findViewById(R.id.div);
        btAc=(Button) findViewById(R.id.Ac);
        stproce=(EditText) findViewById(R.id.proceso);

        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stconcatenar =(EditText) findViewById(R.id.proceso);
                stproce.setText(stconcatenar.getText().toString() + "0");
            }
        });
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stconcatenar =(EditText) findViewById(R.id.proceso);
                stproce.setText(stconcatenar.getText().toString() + "1");
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stconcatenar =(EditText) findViewById(R.id.proceso);
                stproce.setText(stconcatenar.getText().toString() + "2");
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stconcatenar =(EditText) findViewById(R.id.proceso);
                stproce.setText(stconcatenar.getText().toString() + "3");
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stconcatenar =(EditText) findViewById(R.id.proceso);
                stproce.setText(stconcatenar.getText().toString() + "4");
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stconcatenar =(EditText) findViewById(R.id.proceso);
                stproce.setText(stconcatenar.getText().toString() + "5");
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stconcatenar =(EditText) findViewById(R.id.proceso);
                stproce.setText(stconcatenar.getText().toString() + "6");
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stconcatenar =(EditText) findViewById(R.id.proceso);
                stproce.setText(stconcatenar.getText().toString() + "7");
            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stconcatenar =(EditText) findViewById(R.id.proceso);
                stproce.setText(stconcatenar.getText().toString() + "8");
            }
        });
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stconcatenar =(EditText) findViewById(R.id.proceso);
                stproce.setText(stconcatenar.getText().toString() + "9");

            }
        });

        bti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stconcatenar =(EditText) findViewById(R.id.proceso);
                nro2=Integer.parseInt(stconcatenar.getText().toString());
                stproce.setText(stconcatenar.getText().toString() );
                if(operador.equals("+")){
                    stproce.setText("");
                    resultado=nro1+nro2;
                    int a=resultado;

                    }else{

                    if(operador.equals("-")){
                        stproce.setText("");
                        resultado=nro1-nro2;
                    }else{
                        if(operador.equals("*")){
                            stproce.setText("");
                            resultado=nro1*nro2;
                        }else{
                            if(operador.equals("/")){
                                stproce.setText("");
                                if(nro2!=0){
                                    resultado=nro1/nro2;
                                }
                                else{
                                    stproce.setText("INFINITO");
                                }
                            }
                        }
                    }
                }
                stproce.setText(String.valueOf(resultado));
                Toast.makeText(MainActivity.this, "BIEN HECHO", Toast.LENGTH_SHORT).show();
            }
        });
        btsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operador="+";
                stconcatenar =(EditText) findViewById(R.id.proceso);
                nro1=Integer.parseInt(stconcatenar.getText().toString());
                stproce.setText("");
            }
        });
        btresta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operador="-";
                stconcatenar =(EditText) findViewById(R.id.proceso);
                nro1=Integer.parseInt(stconcatenar.getText().toString());
                stproce.setText("");
            }
        });
        btmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operador="*";
                stconcatenar =(EditText) findViewById(R.id.proceso);
                nro1=Integer.parseInt(stconcatenar.getText().toString());
                stproce.setText("");
            }
        });
        btdivi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operador="/";
                stconcatenar =(EditText) findViewById(R.id.proceso);
                nro1=Integer.parseInt(stconcatenar.getText().toString());
                stproce.setText("");
            }
        });
        btAc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nro1=0;
                nro2=0;
                stproce.setText("");
            }
        });
    }
    }
