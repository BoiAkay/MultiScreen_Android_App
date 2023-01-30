package com.example.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.security.PublicKey;

public class MainActivity extends AppCompatActivity {
    public static final String MSG = "com.akay.mutliscreen.ORDER";
    // change package name according to your project
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void placeOrder(View view)
    {

        EditText txt1 = findViewById(R.id.textView1);
        EditText txt2 = findViewById(R.id.textView2);
        EditText txt3 = findViewById(R.id.textView3);
        if(txt1.getText().toString().isEmpty() && txt2.getText().toString().isEmpty() && txt3.getText().toString().isEmpty())
        {
            Toast.makeText(this, "Place atlest one order", Toast.LENGTH_SHORT).show();
        }
        else
        {
            String FinalMsg = "Order for "+txt1.getText().toString()+" , "+txt2.getText().toString()+" & "+txt3.getText().toString()+" is placed !!!";
            Intent intent = new Intent(this,OrderActivity.class);
            intent.putExtra(MSG,FinalMsg);
            startActivity(intent);
        }
    }

}