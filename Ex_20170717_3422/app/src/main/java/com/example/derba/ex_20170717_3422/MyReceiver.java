package com.example.derba.ex_20170717_3422;

import android.Manifest;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.provider.Telephony;
import android.support.v4.content.ContextCompat;
import android.telephony.SmsMessage;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver
{

    @Override
    public void onReceive(Context context, Intent intent)
    {
        Bundle bundle = intent.getExtras();

        if(bundle != null)
        {
            Object[] obj = (Object[])bundle.get("pdus");
            SmsMessage[] sms = new SmsMessage[obj.length];

            if(Build.VERSION.SDK_INT >= 19)
            {
                sms = Telephony.Sms.Intents.getMessagesFromIntent(intent);
            }else
            {
                for(int i = 0; i<obj.length; i++)
                    sms[i] = SmsMessage.createFromPdu((byte[])obj[i]);
            }

            String addr = sms[0].getOriginatingAddress().toString();
            String body = sms[1].getMessageBody().toString();

            Toast.makeText(context, addr + " : " + body, Toast.LENGTH_SHORT).show();
        }
    }
}
