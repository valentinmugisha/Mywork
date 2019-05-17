package com.moise.aimee.sqlitedatabase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
EditText textusername;
EditText textpassword;
Button editregister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
textusername=findViewById(R.id.textusername);
        textpassword=findViewById(R.id.textpassword);
        editregister=findViewById(R.id.editregister);
        editregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tusername,tpassword;
                tusername=textusername.getText().toString();
                tpassword=textpassword.getText().toString();
if (tusername.equals("") && tpassword.equals("")){
    Toast.makeText(Main2Activity.this,"please fill out the blanks",Toast.LENGTH_SHORT).show();

}
else{
    Toast.makeText(Main2Activity.this,"Your registration successful",Toast.LENGTH_SHORT).show();
}
            }

        });

    }

}
