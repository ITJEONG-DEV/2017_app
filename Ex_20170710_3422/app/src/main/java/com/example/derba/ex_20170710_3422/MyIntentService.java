package com.example.derba.ex_20170710_3422;

import android.app.IntentService;
import android.content.Intent;
import android.content.Context;
import android.media.MediaPlayer;

public class MyIntentService extends IntentService
{
    MediaPlayer mp;
    int sec;

    public MyIntentService() {
        super("MyIntentService");
    }
    @Override
    protected void onHandleIntent(Intent intent)
    {
        sec = intent.getIntExtra("sec", 0);
        onPlayMusic();
        while( sec > 0 )
        {
            sec--;
            try
            {
                Thread.sleep(1000);
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }

    public void onPlayMusic()
    {
        mp = mp.create(getApplicationContext(), R.raw.konan);
        mp.setLooping(false);
        mp.start();
    }

}
