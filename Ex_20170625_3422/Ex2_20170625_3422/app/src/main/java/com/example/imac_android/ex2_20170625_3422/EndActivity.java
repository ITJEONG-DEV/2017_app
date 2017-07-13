package com.example.imac_android.ex2_20170625_3422;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by IMAC_Android on 2017-06-25.
 */

public class EndActivity extends AppCompatActivity
{
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);

        tv = (TextView)findViewById(R.id.tv22);

        Intent it = getIntent();

        int time = it.getIntExtra("time", 0);

        tv.setText( String.valueOf((int)(time/100))+"."+String.valueOf((time%100))+"초");
    }

    public void start(View v)
    {
        Intent it = new Intent( this, MainActivity.class);
        it.addFlags( Intent.FLAG_ACTIVITY_CLEAR_TOP );
        startActivity( it );
    }

    public void back(View v)
    {
        Intent it = new Intent( this, MainActivity.class );
        it.addFlags( Intent.FLAG_ACTIVITY_CLEAR_TOP );
        startActivity( it );
    }
}
