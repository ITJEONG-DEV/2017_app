package c.gong.jyo.a.lifegame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by derba on 2017-08-16.
 */

public class HouseActivity extends AppCompatActivity
{
    playerStatus ps;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_house);

        Intent it = new Intent(this.getIntent());
        ps = new playerStatus( it.getFloatArrayExtra("every") );
    }

    public void onCook(View v)
    {

    }

    public void goRoom(View v)
    {
        Intent it = new Intent(HouseActivity.this, RoomActivity.class);
        startActivity(it);
        it.putExtra( "every", ps.getEverything() );
    }

    public void goOut(View v)
    {
        Intent it = new Intent(HouseActivity.this, StreetActivity.class);
        it.putExtra( "every", ps.getEverything() );
        it.putExtra("streetNum", 1);
    }

}
