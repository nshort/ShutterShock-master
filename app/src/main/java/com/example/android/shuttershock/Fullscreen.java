package com.example.android.shuttershock;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by shortn1 on 2/15/2016.
 */
public class Fullscreen extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_fullscreen);
        
        // get intent data
        Intent i = getIntent();

        // Selected image id
        int position = i.getExtras().getInt("id");
        imageView = (ImageView) findViewById(R.id.imageView);

        /*imageView.setImageResource(MainActivity.ICONS[position]);*/


        imageView.setImageResource(position);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        imageView.setAdjustViewBounds(true);
        
    }
}
