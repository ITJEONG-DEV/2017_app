package c.gong.jyo.a.lifegame;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by derba on 2017-08-17.
 */

public class BakeryActivity extends AppCompatActivity
{
    Thread th;
    boolean isEnded = false;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bakery);

        Intent it = new Intent(this.getIntent());

    }

    public class bakeryThread extends Thread
    {
        boolean isCheckTime = false;
        int time = 0;
        int currentTime = 0;
        int customerCount = 0;
        final int customerMax = 4;

        @Override
        public void run()
        {
            while(!isEnded)
            {
                if (isCheckTime)
                {
                    time = (int) Math.random() * 10 + 5;
                    isCheckTime = false;
                } else
                {
                    if (currentTime == time)
                    {
                        if (customerCount < customerMax)
                        {
                            isCheckTime = true;
                            currentTime = 0;
                            customerCount++;
                            initCustomer();
                        }
                    }
                }
                currentTime++;

                try {
                    sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }

        public void initCustomer()
        {
            System.out.println("hi! I'm a customer");
        }
    }

public void goBack(View v)
    {
        Intent it = new Intent(BakeryActivity.this, StreetActivity.class);
        it.putExtra( "street", 2 );
        it.setFlags( Intent.FLAG_ACTIVITY_SINGLE_TOP );
        startActivity(it);
    }
}

