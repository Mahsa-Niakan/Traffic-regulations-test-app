package com.firstprj.mahsan.ayinnameapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    Button goToMnu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showMenu (View v)
    {
        Intent i1 = new Intent(this,MenuActivity.class);
        startActivity(i1);
    }
}
