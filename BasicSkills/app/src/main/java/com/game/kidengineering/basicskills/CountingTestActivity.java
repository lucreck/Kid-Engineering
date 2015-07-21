package com.game.kidengineering.basicskills;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

import com.game.kidengineering.test_loi.TouchAndDrag;


public class CountingTestActivity extends Activity implements View.OnTouchListener {

    ImageView ivSource, ivDestination;
    float temp_X, temp_Y;
    float source_X, source_Y;
    boolean moving;
    ImageView ivStar2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counting_test);
        ivStar2 = (ImageView) findViewById(R.id.iv_answer_star_2);
        ivStar2.setOnTouchListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_counting_test, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                moving = true;
                break;
            case MotionEvent.ACTION_MOVE:
                if(moving){
                    temp_X = event.getRawX() - v.getWidth()/2;
                    temp_Y = event.getRawY() - v.getHeight()/2;
                    v.setX(temp_X);
                    v.setY(temp_Y);
                }
                break;
            case MotionEvent.ACTION_UP:
                moving= false;
                //Toast.makeText(getApplicationContext(), "Raw X: " + event.getRawX() + "  X: " + v.getX(), Toast.LENGTH_LONG).show();
                break;

        }
        return true;
    }
}
