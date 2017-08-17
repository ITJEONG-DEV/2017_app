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
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_house);

        Intent it = new Intent(this.getIntent());
    }

    public void onCook(View v)
    {
        //pop-up
    }

    public void goRoom(View v)
    {
        Intent it = new Intent(HouseActivity.this, RoomActivity.class);
        it.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(it);
    }

    public void goOut(View v)
    {
        Intent it = new Intent(HouseActivity.this, StreetActivity.class);
        it.putExtra("streetNum", 1);
        it.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(it);
    }

}
