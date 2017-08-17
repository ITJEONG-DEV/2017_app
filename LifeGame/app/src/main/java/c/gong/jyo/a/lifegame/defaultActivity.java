package c.gong.jyo.a.lifegame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by derba on 2017-08-17.
 */

public class defaultActivity extends AppCompatActivity
{
    playerStatus ps;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        Intent it = new Intent(this.getIntent());
        ps = new playerStatus( it.getFloatArrayExtra("every") );
    }

    public void onClick(View v)
    {
        Intent it = new Intent(defaultActivity.this, defaultActivity.class);
        it.putExtra( "every", ps.getEverything() );
        it.setFlags( Intent.FLAG_ACTIVITY_SINGLE_TOP );
        startActivity(it);
    }
}
