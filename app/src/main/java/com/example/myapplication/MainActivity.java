package com.example.myapplication;

import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.fragment.app.FragmentActivity;

public class MainActivity extends FragmentActivity{

    private String url = "www.hdgx518.com";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //获得控件
        WebView webView = findViewById(R.id.wv_webview);
        //访问网页
        webView.loadUrl(url);
        //系统默认会通过手机浏览器打开网页，为了能够直接通过WebView显示网页，则必须设置
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                //使用WebView加载显示url
                //view.loadUrl(url);
                //返回true
                //return true;
                return super.shouldOverrideUrlLoading(view,request);
            }
        });
    }
}
