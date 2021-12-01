package com.example.menus

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient

class AndroidDevelopment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android_development)

        val myBrowser: WebView = findViewById(R.id.myWeb)
        myBrowser.webViewClient = WebViewClient()
//Shows the URL
        myBrowser.loadUrl("https://www.google.com")
//Set the Web View to have a transparent border
        myBrowser.setBackgroundColor(Color.TRANSPARENT)
//To enable JavaScript for the web browser
        myBrowser.settings.javaScriptEnabled = true
//to load images automatically
        myBrowser.settings.loadsImagesAutomatically = true
//Enable Scrolling
        myBrowser.scrollBarStyle = View.SCROLLBARS_INSIDE_OVERLAY


    }
}