package com.example.lenovo.randommoive;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

/**
 * Created by Lenovo on 2016-06-21.
 */
public class ComedyM extends Activity {
    Integer Random;
    ImageView mImageView;

    public static final int[] ran= {
            R.drawable.comedy1, R.drawable.comedy2, R.drawable.comedy3,
            R.drawable.comedy4, R.drawable.comedy5, R.drawable.comedy6,
            R.drawable.comedy7, R.drawable.comedy8, R.drawable.comedy9
    };
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comedy);
        mImageView=(ImageView) findViewById(R.id.c1);
        Random = (int)(Math.random()*10)-1;
        int res = ran[Random];
        mImageView.setImageResource(res);

    }
}
