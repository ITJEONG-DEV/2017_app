package com.example.imac_android.ex2_20170625_3422;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity
{
    Button b1, b2, b3, b4;
    TextView tv;
    Thread th;

    boolean alpha = true;

    int stage2 = 1;
    int n1, n2;
    int answer;

    int nTime = 0;

    public void initThread()
    {
        th = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                while(alpha)
                {
                    nTime++;
                    try
                    {
                        Thread.sleep(10);
                    } catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
            }
        });
    }



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent it = getIntent();

        b1 = (Button)findViewById(R.id.b1);
        b2 = (Button)findViewById(R.id.b2);
        b3 = (Button)findViewById(R.id.b3);
        b4 = (Button)findViewById(R.id.b4);

        tv = (TextView)findViewById(R.id.textView);

        initThread();

        th.start();

        stage();
    }

    public void stage()
    {
        int[] a = new int[]{0, 0, 0, 0};


        System.out.println(1);

        n1 = (int)(Math.random()*4)+5;
        n2 = (int)(Math.random()*4)+5;
        answer = (int)(Math.random()*4)+1;

        tv.setText("Q"+stage2+"."+String.valueOf(n1)+"X"+String.valueOf(n2)+"?");

        System.out.println("this : n1 : "+n1+"  n2 : "+n2+"  answer : "+answer);

        System.out.println(2);

        a[answer-1] = n1*n2;

        for( int i = 1; i <= 4; i++ )
        {
            int cha = i - answer;

            a[i-1] = a[answer-1] + cha;
        }

        System.out.println("a array : "+a[0]+a[1]+a[2]+a[3]);

        b1.setText( String.valueOf(a[0]) );
        b2.setText( String.valueOf(a[1]) );
        b3.setText( String.valueOf(a[2]) );
        b4.setText( String.valueOf(a[3]) );
    }

    public void hi(View v)
    {
        int sel = 0;
        switch( v.getId() )
        {
            case R.id.b1 : sel = 1; break;
            case R.id.b2 : sel = 2; break;
            case R.id.b3 : sel = 3; break;
            case R.id.b4 : sel = 4; break;
        }

        if( sel == answer )
        {
            stage2++;

            if(stage2 > 10)
            {
                alpha = false;
                System.out.println(nTime);

                Intent it = new Intent( this, EndActivity.class );
                it.putExtra("time", nTime);
                it.addFlags( Intent.FLAG_ACTIVITY_CLEAR_TOP );
                startActivity(it);
            }
            else stage();
        }
        else nTime+=100;
    }
}
