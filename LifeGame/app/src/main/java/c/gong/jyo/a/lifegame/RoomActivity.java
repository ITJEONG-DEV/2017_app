package c.gong.jyo.a.lifegame;

/**
 * Created by derba on 2017-08-16.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class RoomActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_house);

        Intent it = new Intent(this.getIntent());
    }

    public void readBook(View v)
    {
    }

    public void onComputer(View v)
    {
    }

    public void goBack(View v)
    {
        Intent it = new Intent(RoomActivity.this, HouseActivity.class);
        it.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(it);
    }
}