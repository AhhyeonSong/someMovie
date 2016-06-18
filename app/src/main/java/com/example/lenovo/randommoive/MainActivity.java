package com.example.lenovo.randommoive;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends Activity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton img_but=(ImageButton)findViewById(R.id.but_start);
        img_but.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v){
                Intent intent=new Intent(
                getApplicationContext(), // 현재 화면의 제어권자
                        SubAcitivity.class); // 다음 넘어갈 클래스 지정
                startActivity(intent);
            }
        }
        );
    }
}
