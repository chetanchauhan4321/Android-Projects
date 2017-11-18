package com.example.user.agecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.StrictMath.abs;

public class MainActivity extends AppCompatActivity {

    EditText et1, et2, et3, et21, et22, et23;

    TextView tv3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        et3 = (EditText) findViewById(R.id.et3);
        et21 = (EditText) findViewById(R.id.et21);
        et22 = (EditText) findViewById(R.id.et22);
        et23 = (EditText) findViewById(R.id.et23);
        tv3=(TextView) findViewById(R.id.tv3);
    }

    public void dothis(View v) {
        if(v.getId()==R.id.b1) {
            int x1 = Integer.parseInt(et3.getText().toString());
            int y1= Integer.parseInt(et23.getText().toString());
            int z1= abs(y1 - x1);
            int x2 = Integer.parseInt(et2.getText().toString());
            int y2= Integer.parseInt(et22.getText().toString());
            int z2= abs(y2 - x2);
            int x3 = Integer.parseInt(et1.getText().toString());
            int y3= Integer.parseInt(et21.getText().toString());
            int z3= abs(y3 - x3);




            tv3.setText("You are" +" "+z1+"year"+" "+z2+"month"+" "+z3+"days old");

        }

    }
}
