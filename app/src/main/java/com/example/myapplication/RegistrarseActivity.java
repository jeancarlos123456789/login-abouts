package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class RegistrarseActivity extends AppCompatActivity {

    EditText txtNombre;
    EditText txtApellido;
    EditText txtTelefono;
    EditText txtCorreo;
    Button btnRegresar;
    Button btnAceptar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrarse);
        txtNombre = findViewById(R.id.txtNombre);
        txtApellido = findViewById(R.id.txtApellido);
        txtTelefono = findViewById(R.id.txtTelefono);
        txtCorreo = findViewById(R.id.txtCorreo);
        btnRegresar = findViewById(R.id.btnRegresar);
        btnAceptar = findViewById(R.id.btnAceptar);
    }
}
