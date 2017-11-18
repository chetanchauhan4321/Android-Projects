package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button b11;
    int w,h;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b11=(Button)findViewById(R.id.b11);
        b11.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       int k = v.getId();
                                       switch (k) {
                                           case R.id.b11:
                                               w = getwidth();
                                               h = getheight();
                                               break;
                                       }
                                   }
            public int getwidth()
            {
                int x=230;
                return x;
            }
            public int getheight()
            {int h=250;
                return h;
            }


                               }
        );

    }
}
