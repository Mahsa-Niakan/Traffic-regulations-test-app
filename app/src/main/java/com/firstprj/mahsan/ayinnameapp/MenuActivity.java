package com.firstprj.mahsan.ayinnameapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;


/**
 * Created by Mahsan on 02/26/2017.
 */


public class MenuActivity extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
    public void showIndex(View v){
        Intent i1 = new Intent(this,BookIndexActivity.class);
        startActivity(i1);
    }

    public void showQuiz(View v){
        Intent i1 = new Intent(this,QuizActivity.class);
        startActivity(i1);
    }
}
