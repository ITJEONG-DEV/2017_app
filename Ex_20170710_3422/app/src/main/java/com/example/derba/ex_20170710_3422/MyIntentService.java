package com.example.derba.ex_20170710_3422;

import android.app.IntentService;
import android.content.Intent;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.Nullable;

public class MyIntentService extends IntentService
{
    MediaPlayer mp;
    int sec;
    MusicBinder mb = new MusicBinder();

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
        Intent it = new Intent(getApplicationContext(), StopActivity.class);
        startActivity(it);

        while(true)
        {
            try
            {
                Thread.sleep(10);
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

    @Nullable
    @Override
    public IBinder onBind(Intent intent)
    {
        return mb;
    }

    class MusicBinder extends Binder
    {
        MyIntentService getService()
        {
            return MyIntentService.this;
        }
    }

    @Override
    public void onDestroy()
    {
        if( mp != null ) mp.release();
    }
}
