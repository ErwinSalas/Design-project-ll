package com.example.pavilion.designprojectll_v2.Auth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.pavilion.designprojectll_v2.MainActivity;
import com.example.pavilion.designprojectll_v2.R;

import Controllers.UserController;
import Provider.GlobalsProvider;

public class LoginActivity extends AppCompatActivity {
    Button btnLogin;
    TextView register;
    EditText user,pass;
    UserController controller;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        user= (EditText) findViewById(R.id.editTexttUsuario);
        pass= (EditText) findViewById(R.id.editTextContraseña);
        register= (TextView) findViewById(R.id.textViewRegistrarse);
        btnLogin= (Button) findViewById(R.id.ButtonLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                controller = new UserController();
                controller.authenticateUser(user.getText().toString(),pass.getText().toString());
                if(GlobalsProvider.AuthUser!=null){
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(getApplicationContext(), "Credenciales incorrectos ", Toast.LENGTH_LONG).show();
                }

            }
        });
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), RegisterActivity.class);
                startActivity(intent);
            }
        });

    }
}
