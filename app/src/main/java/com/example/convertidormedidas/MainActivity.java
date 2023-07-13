package com.example.convertidormedidas;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText valor;
TextView Resultado;
Button Calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        valor=findViewById(R.id.valor);
        Resultado=findViewById(R.id.resultado);
        Calcular=findViewById(R.id.calcular);

        Calcular.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                operar();
            }
         });


    }
    public void operar()
    {
        double respu;
        if(valor.getText().toString().intern()!="")
        {
            respu=Double.parseDouble(valor.getText().toString())/100;
            Resultado.setText(respu+" Metros");
            valor.setText("");
            Toast.makeText(this, "Operación ejecutada", Toast.LENGTH_SHORT).show();
        }
       else
       {

            Toast.makeText(this, "Digite un valor", Toast.LENGTH_SHORT).show();
       }
    }
}