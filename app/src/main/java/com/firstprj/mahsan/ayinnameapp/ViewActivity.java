package com.firstprj.mahsan.ayinnameapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;

/**
 * Created by Mahsan on 02/27/2017.
 */

public class ViewActivity extends Activity {
    WebView wv1;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        init();

    }


    public void init()
    {
        wv1 = (WebView) findViewById(R.id.WebView1);
    }

}
