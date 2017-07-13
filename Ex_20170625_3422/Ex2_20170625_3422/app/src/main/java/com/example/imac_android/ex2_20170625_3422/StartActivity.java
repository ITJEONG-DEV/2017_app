package com.example.imac_android.ex2_20170625_3422;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by IMAC_Android on 2017-06-25.
 */

public class StartActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }

    public void go(View v)
    {
        Intent it = new Intent( this, MainActivity.class );
        it.addFlags( Intent.FLAG_ACTIVITY_CLEAR_TOP );
        startActivity(it);
    }
}
