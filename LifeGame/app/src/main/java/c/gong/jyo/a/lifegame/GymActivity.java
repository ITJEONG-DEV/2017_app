package c.gong.jyo.a.lifegame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by derba on 2017-08-17.
 */

public class GymActivity extends AppCompatActivity
{
    playerStatus ps;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gym);

        Intent it = new Intent(this.getIntent());
        ps = new playerStatus( it.getFloatArrayExtra("every") );
    }
}
