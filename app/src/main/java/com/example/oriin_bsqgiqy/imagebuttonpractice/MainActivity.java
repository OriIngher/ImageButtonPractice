package com.example.oriin_bsqgiqy.imagebuttonpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
ImageButton ib1;
ImageView iv1;
Random rnd = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv1 = (ImageView)findViewById(R.id.iv1);
        ib1 = (ImageButton)findViewById(R.id.ib1);
    }

    public void go(View view)
    {
        int x = rnd.nextInt();
        if (x<0)
        {
            x = -x;
        }
        x = x%3;
        x++;

        switch (x)
        {
            case 1:
            {
                iv1.setImageResource(R.drawable.cat);
                ib1.setImageResource(R.drawable.a1);
                break;
            }
            case 2:
            {
                iv1.setImageResource(R.drawable.dog);
                ib1.setImageResource(R.drawable.a2);
                break;
            }
            case 3:
            {
                iv1.setImageResource(R.drawable.horse);
                ib1.setImageResource(R.drawable.a3);
                break;
            }

        }
    }
}
