package com.example.tvshows.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import com.example.tvshows.R;
import com.example.tvshows.databinding.ActivityDownloadBinding;

public class DownloadActivity extends AppCompatActivity {

    private ActivityDownloadBinding activityDownloadBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityDownloadBinding = DataBindingUtil.setContentView(this, R.layout.activity_download);
        initializeWebView();
    }

    @SuppressLint("SetJavaScriptEnabled")
    private void initializeWebView() {
        WebSettings webSettings = activityDownloadBinding.revmozWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        activityDownloadBinding.revmozWebView.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                activityDownloadBinding.setIsProcessing(true);
            }
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                activityDownloadBinding.setIsProcessing(false);
            }
        });
        activityDownloadBinding.revmozWebView.loadUrl("https://revmoz.com/");
    }
}