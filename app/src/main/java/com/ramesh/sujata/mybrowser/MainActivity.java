package com.ramesh.sujata.mybrowser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    private static WebView browser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        openbrowser();

    }

    public void onResume(){
        super.onResume();
        openbrowser();
    }

    public void onRestart(){
        super.onRestart();
        openbrowser();
    }
    public void openbrowser(){
        browser=(WebView)findViewById(R.id.webView);
        browser.getSettings().setLoadsImagesAutomatically(true);
        browser.getSettings().setJavaScriptEnabled(true);
        browser.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        browser.loadUrl("https://www.google.com");
    }
}
