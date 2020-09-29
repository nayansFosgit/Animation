package com.nayan.anime;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    boolean barthIsShowing = true; //to track which image is showing //
    public void fade(View view){

        Log.i("info ","fetched");

        ImageView bartImageView = (ImageView) findViewById(R.id.bartImageView);

        ImageView hommerImageView = (ImageView) findViewById(R.id.homerImageView);

        if(barthIsShowing) {     //then we fade out bart and fade in homer//

             //we have to change it to false because we faded him out//

            bartImageView.animate().alpha(0).setDuration(2000);

            hommerImageView.animate().alpha(1).setDuration(2000);

            barthIsShowing = false;

        }else {                 //we fade in bart and fade out homer//

              //we have to change because we faded him in//

            bartImageView.animate().alpha(1).setDuration(2000);

            hommerImageView.animate().alpha(0).setDuration(2000);

            barthIsShowing = true;

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
