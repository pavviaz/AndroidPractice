package com.example.navigationdraweractivity.ui.browser;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.navigationdraweractivity.R;


public class BrowserFragment extends Fragment {


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_nav_browser, container, false);
        WebView webView = root.findViewById(R.id.webview);
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setDefaultFontSize(12);
        webView.loadUrl("https://www.google.com/");

        return root;
    }
}