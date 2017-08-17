package c.gong.jyo.a.lifegame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by derba on 2017-08-16.
 */

public class StreetActivity extends AppCompatActivity
{
    playerStatus ps;
    Button b1, b2, b3;

    int streetNum;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_street);

        Intent it = new Intent(this.getIntent());
        streetNum = it.getIntExtra("streetNum", 0);
        ps = new playerStatus( it.getFloatArrayExtra("every") );

        b1 = (Button)findViewById(R.id.button1);
        b2 = (Button)findViewById(R.id.button2);
        b3 = (Button)findViewById(R.id.button3);

        initImage();
    }

    public void initImage()
    {
        switch(streetNum)
        {
            // View.VISIBLE
            // View.INVISIBLE
            // View.GONE
            case 1:
                b2.setVisibility(View.VISIBLE);
                b3.setVisibility(View.VISIBLE);
                break;
            case 2:
                b2.setVisibility(View.VISIBLE);
                b3.setVisibility(View.GONE);
                break;
            case 3:
                b2.setVisibility(View.VISIBLE);
                b3.setVisibility(View.GONE);
                break;
            case 4:
                b2.setVisibility(View.GONE);
                b3.setVisibility(View.GONE);
                break;
            case 5:
                b2.setVisibility(View.VISIBLE);
                b3.setVisibility(View.VISIBLE);
                break;
            case 6:
                b2.setVisibility(View.GONE);
                b3.setVisibility(View.GONE);
                break;
            case 7:
                b2.setVisibility(View.GONE);
                b3.setVisibility(View.GONE);
                break;
        }
    }

    public void onButton(View v)
    {
        Intent it;

        int touchNum = 0;

        if ( v.getId() == b1.getId() ) touchNum = 1;
        else if ( v.getId() == b2.getId() ) touchNum = 2;
        else if ( v.getId() == b3.getId() ) touchNum = 3;

        switch( streetNum )
        {
            case 1:
                switch( touchNum )
                {
                    case 1:
                        it = new Intent(StreetActivity.this, GymActivity.class);
                        it.putExtra( "every", ps.getEverything() );
                        startActivity(it);
                    case 2:
                    case 3:
                }
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
        }
    }
}