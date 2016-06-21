package com.example.lenovo.randommoive;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

/**
 * Created by Lenovo on 2016-06-18.
 */
public class SubAcitivity extends Activity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub01);  // layout xml 과 자바파일을 연결
        final RadioGroup genre = (RadioGroup)findViewById(R.id.rg_genre);
        Button b = (Button)findViewById(R.id.next);
        RadioButton romance = (RadioButton) findViewById(R.id.romance);
        RadioButton thriller = (RadioButton) findViewById(R.id.thriller);
        RadioButton horror = (RadioButton) findViewById(R.id.horror);
        RadioButton comedy = (RadioButton) findViewById(R.id.comedy);
        RadioButton action = (RadioButton) findViewById(R.id.action);
        RadioButton fantasy = (RadioButton) findViewById(R.id.fantasy);
        RadioButton animation = (RadioButton) findViewById(R.id.animation);
        romance.setOnClickListener(this);
        thriller.setOnClickListener(this);
        horror.setOnClickListener(this);
        comedy.setOnClickListener(this);
        action.setOnClickListener(this);
        fantasy.setOnClickListener(this);
        animation.setOnClickListener(this);


      }


    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.romance:
                Intent romance= new Intent(SubAcitivity.this, RomanceM.class);
                startActivity(romance); break;
            case R.id.horror:
                Intent horror= new Intent(SubAcitivity.this, MainActivity.class);
                startActivity(horror); break;
            case R.id.action:
                Intent action= new Intent(SubAcitivity.this, ActionM.class);
                startActivity(action); break;
            case R.id.fantasy:
                Intent fantasy= new Intent(SubAcitivity.this, MainActivity.class);
                startActivity(fantasy); break;
            case R.id.comedy:
                Intent comedy= new Intent(SubAcitivity.this, MainActivity.class);
                startActivity(comedy); break;
            case R.id.thriller:
                Intent thriller= new Intent(SubAcitivity.this, MainActivity.class);
                startActivity(thriller); break;
            case R.id.animation:
                Intent animation= new Intent(SubAcitivity.this, MainActivity.class);
                startActivity(animation); break;
        }
    }
}
