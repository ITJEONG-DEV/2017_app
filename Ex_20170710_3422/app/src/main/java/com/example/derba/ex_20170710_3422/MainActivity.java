package com.example.derba.ex_20170710_3422;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText)findViewById(R.id.edText);
    }

    public void onMusicStart(View v)
    {
        int a = Integer.parseInt(editText.getText().toString());

        Intent it = new Intent(this, MyIntentService.class);
        it.putExtra("sec", a);
        startService(it);
    }
}
