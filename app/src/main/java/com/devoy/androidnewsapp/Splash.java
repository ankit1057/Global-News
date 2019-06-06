package com.devoy.androidnewsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

import com.roger.gifloadinglibrary.GifLoadingView;

public class Splash extends AppCompatActivity {
    private GifLoadingView mGifLoadingView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        mGifLoadingView = new GifLoadingView();
        mGifLoadingView.setCancelable(false);
        mGifLoadingView.setImageResource(R.drawable.num69);
        mGifLoadingView.show(getFragmentManager(), "");

    }
}
