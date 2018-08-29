package com.firstprj.mahsan.ayinnameapp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

/**
 * Created by Mahsan on 02/26/2017.
 */

public class BookIndexActivity extends Activity{
    Button f1,f2,f3,f4,f5,f6,f7,f8,f9,f10;
    WebView w1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookindex);

        init();


    }

    public void init()
    {
        f1=(Button) findViewById(R.id.fasl1);
        f2=(Button) findViewById(R.id.fasl2);
        f3=(Button) findViewById(R.id.fasl3);
        f4=(Button) findViewById(R.id.fasl4);
        f5=(Button) findViewById(R.id.fasl5);
        f6=(Button) findViewById(R.id.fasl6);
        f7=(Button) findViewById(R.id.fasl7);
        f8=(Button) findViewById(R.id.fasl8);
        f9=(Button) findViewById(R.id.fasl9);
        f10=(Button) findViewById(R.id.fasl10);

        w1 = (WebView) findViewById(R.id.WebView1);

    }
    public void showPdf1(View v)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0Bx1GOmOepx_RVU5xQ1NzSm5SNUE"));
        startActivity(browserIntent);
    }
    public void showPdf2(View v)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0Bx1GOmOepx_RTkdwSENtRlMwU0U"));
        startActivity(browserIntent);
    }
    public void showPdf3(View v)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0Bx1GOmOepx_RdDhVRF9vX3BmODg"));
        startActivity(browserIntent);
    }
    public void showPdf4(View v)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0Bx1GOmOepx_RNDYwbWd6SXRiS3c"));
        startActivity(browserIntent);
    }
    public void showPdf5(View v)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0Bx1GOmOepx_RdTlPLVd3NU40d28"));
        startActivity(browserIntent);
    }
    public void showPdf6(View v)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0Bx1GOmOepx_RRXRHZE1hSTRHazA"));
        startActivity(browserIntent);
    }
    public void showPdf7(View v)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0Bx1GOmOepx_RTXdxX2x3eVRQd0U"));
        startActivity(browserIntent);
    }
    public void showPdf8(View v)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0Bx1GOmOepx_RMXBqRDRDbjlsa1E"));
        startActivity(browserIntent);
    }
    public void showPdf9(View v)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0Bx1GOmOepx_RVU5xQ1NzSm5SNUE"));
        startActivity(browserIntent);
    }
    public void showPdf10(View v)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0Bx1GOmOepx_RcEw3MHJ2WWYzWjg"));
        startActivity(browserIntent);
    }

}
