package com.example.whip.webview2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn1,btn2;
    WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        webview = (WebView) findViewById(R.id.webview1);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch(view.getId()){
            case R.id.btn1:
                webview.loadUrl("https://developer.android.com/studio/index.html");
                break;
            case R.id.btn2:
                Uri uri = Uri.parse("https://developer.android.com/studio/index.html");
                Intent intent = new Intent (Intent.ACTION_VIEW,uri);
                startActivity(intent);
                break;
        }
    }
}
