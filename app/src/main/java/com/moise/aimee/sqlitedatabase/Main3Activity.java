package com.moise.aimee.sqlitedatabase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
TextView userpage;
Button seeusers;
Mydatabasehelper databasehelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        userpage=findViewById(R.id.userpage);
        seeusers=findViewById(R.id.seeusers);
        databasehelper = new Mydatabasehelper(this,null,null,1);
printDB();
    }
public void addbuttonusers(View v){
        Tasks tasks=new Tasks(userpage.getText().toString());
        databasehelper.addTasks(tasks);
        printDB();
}
public void printDB(){
        String dbString=databasehelper.toString();
        userpage.setText(dbString);
}
}
