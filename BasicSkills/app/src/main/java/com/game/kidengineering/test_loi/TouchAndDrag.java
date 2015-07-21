package com.game.kidengineering.test_loi;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by vanhai on 7/21/2015.
 */
public class TouchAndDrag{
    ImageView ivSource, ivDestination;
    float temp_X, temp_Y;
    float source_X, source_Y;
    boolean moving;

    public void TouchAndDrag(){

    }

    public boolean onMyTouch(View v, MotionEvent event) {
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
