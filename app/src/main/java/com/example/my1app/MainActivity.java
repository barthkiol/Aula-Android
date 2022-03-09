package com.example.my1app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView2;
    TextView textView4;
    TextView textView5;
    TextView text_resultado;
    Button button_soma;

    int num1 = 0;
    int num2 = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView2 = (TextView) findViewById(R.id.textView2);
        textView4 = (TextView) findViewById(R.id.textView4);
        textView5 = (TextView) findViewById(R.id.textView5);
        text_resultado = (TextView) findViewById(R.id.text_resultado);
        button_soma = (Button) findViewById(R.id.button_soma);

        button_soma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View vSoma) {
                int num1 = Integer.parseInt(textView2.getText().toString());
                int num2 = Integer.parseInt(textView4.getText().toString());
                int result = num1 + num2;

                text_resultado.setText("Resutlado= " + result);
            }
        });

    }


}