package com.example.admin.regv2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2,e3,e4;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.name);
        e2=findViewById(R.id.email);
        e3=findViewById(R.id.desg);
        e4=findViewById(R.id.cmp);
        b1=findViewById(R.id.reg);
    }
    public void buttonclick(View view)
    {
        String n=e1.getText().toString();
        String e=e2.getText().toString();
        Toast.makeText(this, "Welcome "+n, Toast.LENGTH_SHORT).show();
    }
}
