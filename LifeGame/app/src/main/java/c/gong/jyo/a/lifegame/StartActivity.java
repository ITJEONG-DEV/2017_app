package c.gong.jyo.a.lifegame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StartActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }

    public void onStart(View v)
    {
        playerStatus ps = new playerStatus();
        Intent it = new Intent(StartActivity.this, HouseActivity.class);
        it.putExtra( "every", ps.getEverything() );
        startActivity(it);
    }

}
