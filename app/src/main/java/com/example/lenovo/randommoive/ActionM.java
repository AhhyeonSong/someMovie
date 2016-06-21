package com.example.lenovo.randommoive;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

/**
 * Created by Lenovo on 2016-06-20.
 */
public class ActionM extends Activity {
    Integer Random;
    ImageView mImageView;

    public static final int[] ran= {
            R.drawable.action1, R.drawable.action2, R.drawable.action3,
            R.drawable.action4, R.drawable.action5, R.drawable.action6,
            R.drawable.action7, R.drawable.action8, R.drawable.action9
    };
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_romance);
        mImageView=(ImageView) findViewById(R.id.r1);
        Random = (int)(Math.random()*10)-2;
        int res = ran[Random];
        mImageView.setImageResource(res);

    }
}
