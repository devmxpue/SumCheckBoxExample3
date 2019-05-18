package com.example.proyecto003;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText1,editText2;
    private TextView textView3;
    private CheckBox checkBox1,checkBox2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1= (EditText) findViewById(R.id.editText1);
        editText2= (EditText) findViewById(R.id.editText2);
        textView3= (TextView) findViewById(R.id.textView3);
        checkBox1= (CheckBox) findViewById(R.id.checkBox1);
        checkBox2= (CheckBox) findViewById(R.id.checkBox2);
    }
// que solo ingrese   valores numericos, validar
    public void Operar(View view) {
        String valor1 = editText1.getText().toString();
        String valor2 = editText2.getText().toString();
        double nro1= Double.parseDouble(valor1);
        double nro2= Double.parseDouble(valor2);
        String resu="";// limpia el campo
        if (checkBox1.isChecked()==true) {
            double suma=nro1+nro2;

            resu="La suma es: "+ suma;
        }
        if (checkBox2.isChecked()==true) {
            double resta=nro1-nro2;

            resu = " La resta es: "+ resta;
        }

        textView3.setText(resu);
    }
}
