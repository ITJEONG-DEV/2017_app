package c.gong.jyo.a.lifegame;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

/**
 * Created by derba on 2017-08-17.
 */

public class ShopActivity extends AppCompatActivity
{
    ArrayList<Integer> arr;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);

        Intent it = new Intent(this.getIntent());
        initButton();
    }

    public void initButton()
    {
        arr= new ArrayList<Integer>(  );
        arr.add(R.id.button7);
        arr.add(R.id.button12);
        arr.add(R.id.button11);
        arr.add(R.id.button10);
        arr.add(R.id.button9);
        arr.add(R.id.button8);
    }

    public void onItem(View v)
    {
        int i;
        for( i = 0; i<arr.size(); i++)
        {
            if ( arr.get(i) == v.getId() ) break;
        }
    }
}
