package com.faulinaindri202102297.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewLanjutanMainActivity extends AppCompatActivity {

    private WebView _webViewLanjutan;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view_lanjutan_main);

        _webViewLanjutan = (WebView) findViewById(R.id.webViewLanjutan);

        WebViewClient webViewClient = new WebViewClient();
        _webViewLanjutan.setWebViewClient(webViewClient);

        WebChromeClient webChromeClient = new WebChromeClient();
        _webViewLanjutan.setWebChromeClient(webChromeClient);

        WebSettings webSettings = _webViewLanjutan.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true);

        WebAppInterface webAppInterface = new WebAppInterface(this, WebViewLanjutanMainActivity.this );
        _webViewLanjutan.addJavascriptInterface(webAppInterface, "Android" );

        String url = "https://faulina-202102297.000webhostapp.com/";
        _webViewLanjutan.loadUrl(url);
    }
}