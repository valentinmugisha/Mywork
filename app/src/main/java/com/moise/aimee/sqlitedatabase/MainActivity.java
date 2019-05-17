`package com.moise.aimee.sqlitedatabase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
 EditText username;
EditText password;
Button loginbutton;
Button registerbutton;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=findViewById(R.id.username);
        password=findViewById(R.id.password);
        loginbutton=findViewById(R.id.loginbutton);
        registerbutton=findViewById(R.id.registerbutton);
        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String editusername,editpassword;
                editusername=username.getText().toString();
                editpassword=password.getText().toString();
if (editusername.equals(username) && editpassword.equals(password)){
    Intent intent=new Intent(MainActivity.this,Main3Activity.class);
    startActivity(intent);
}
   else{
    Toast.makeText(MainActivity.this,"incorrect username or password",Toast.LENGTH_SHORT).show();
}

            }
        });
        registerbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Main3Activity.class);
                startActivity(intent);
            }
        });

    }
}
