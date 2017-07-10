package com.example.derba.ex_20170710_3422;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StopActivity extends AppCompatActivity
{
    MyIntentService mService;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stop);

        Intent it = new Intent(this, MyIntentService.class);
        bindService(it, conn, Context.BIND_ABOVE_CLIENT);
    }

    public void onMusicStop(View v)
    {
        Intent it = new Intent(this, MyIntentService.class);
        stopService(it);
    }

    public void onGetRunTime(View v)
    {
        int a = mService.mp.getCurrentPosition();
        System.out.println("time : "+a);
    }

    ServiceConnection conn = new ServiceConnection()
    {
        @Override
        public void onServiceConnected(ComponentName componentName, IBinder iBinder)
        {

            MyIntentService.MusicBinder mb = (MyIntentService.MusicBinder)iBinder;

            mService = mb.getService();
        }

        @Override
        public void onServiceDisconnected(ComponentName componentName)
        {
        }
    };
}
