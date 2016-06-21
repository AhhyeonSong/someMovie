package com.example.lenovo.randommoive;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

/**
 * Created by Lenovo on 2016-06-19.
 */
public class RomanceM extends Activity {
    Integer Random;
    ImageView mImageView;

    public static final int[] ran= {
            R.drawable.romance1, R.drawable.romance2, R.drawable.romance3,
            R.drawable.romance4, R.drawable.romance5, R.drawable.romance6,
            R.drawable.romance7, R.drawable.romance8, R.drawable.romance9, R.drawable.romance10,R.drawable.romance11
    };
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_romance);
        mImageView=(ImageView) findViewById(R.id.r1);
        Random = (int)(Math.random()*10)+1;
        int res = ran[Random];
        mImageView.setImageResource(res);

    }
}
