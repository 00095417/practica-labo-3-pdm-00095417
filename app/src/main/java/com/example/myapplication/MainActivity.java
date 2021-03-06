package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btn_submit;
    EditText edit_name, edit_email, edit_pass, edit_gender;
    String info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_submit = findViewById(R.id.btn_submit);
        edit_name = findViewById(R.id.edit_name);
        edit_email = findViewById(R.id.edit_email);
        edit_pass = findViewById(R.id.edit_pass);
        edit_gender = findViewById(R.id.edit_gender);

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                info = "nombre: " + edit_name.getText().toString() +"\n"+
                        "email: " + edit_email.getText().toString() +"\n"+
                        "password: " + edit_pass.getText().toString() +"\n"+
                        "genero: " + edit_gender.getText().toString();

                Intent m_Intent = new Intent(MainActivity.this,NewActivity.class);
                m_Intent.putExtra(AppConstants.INTENT_MESSAGE_KEY,info);
                startActivity(m_Intent);
            }
        });

    }
}
