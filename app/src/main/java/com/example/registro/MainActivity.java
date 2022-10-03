package com.example.registro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    Switch SwitchM;
    EditText NumeroMas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SwitchM= (Switch) findViewById(R.id.idswitch);
        NumeroMas = (EditText) findViewById(R.id.NumeroM);
    }

    public void onclick(View view) {
        if (view.getId() == R.id.idswitch) {
            if (SwitchM.isChecked()) {
                NumeroMas.setText("Numero de Mascotas");
            } else {
                NumeroMas.setText("*No escriba nada en este campo*");
            }
        }
    }
}