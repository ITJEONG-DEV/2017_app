package c.gong.jyo.a.lifegame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by derba on 2017-08-17.
 */

public class GymActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gym);

        Intent it = new Intent(this.getIntent());
    }

    public void onRunning(View v)
    {

    }

    public void onBench(View v)
    {

    }

    public void onContest(View v)
    {
        Intent it = new Intent(GymActivity.this, ContestActivity.class);
        it.setFlags( Intent.FLAG_ACTIVITY_SINGLE_TOP );
        startActivity(it);
    }

    public void onSand(View v)
    {

    }

    public void goBack(View v)
    {
        Intent it = new Intent(GymActivity.this, StreetActivity.class);
        it.putExtra( "street", 1 );
        it.setFlags( Intent.FLAG_ACTIVITY_SINGLE_TOP );
        startActivity(it);
    }
}
