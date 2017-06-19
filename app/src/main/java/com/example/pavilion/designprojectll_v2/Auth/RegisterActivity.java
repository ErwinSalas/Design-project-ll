package com.example.pavilion.designprojectll_v2.Auth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.pavilion.designprojectll_v2.MainActivity;
import com.example.pavilion.designprojectll_v2.R;

import Controllers.UserController;
import Models.User;
import Provider.GlobalsProvider;

public class RegisterActivity extends AppCompatActivity {
    EditText email,pass,phone,name;
    Button btnRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        email=(EditText) findViewById(R.id.editTextCorreo);
        pass=(EditText) findViewById(R.id.editTextContraseña);
        phone=(EditText) findViewById(R.id.editTextTelefono);
        name=(EditText) findViewById(R.id.editTextNombre);
        btnRegister= (Button) findViewById(R.id.ButtonRegister);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User nUser=new User(0,name.getText().toString(),email.getText().toString(),
                        phone.getText().toString(),pass.getText().toString());
                UserController controller= new UserController();
                controller.create(nUser);
                if(GlobalsProvider.AuthUser!=null){
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(getApplicationContext(), "Ocurrio un fallo", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
