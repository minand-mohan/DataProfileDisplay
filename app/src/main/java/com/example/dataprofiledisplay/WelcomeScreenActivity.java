package com.example.dataprofiledisplay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class WelcomeScreenActivity extends AppCompatActivity {

    private static int SPLASH_SCREEN_DELAY = 4000;
    private Animation topAnim, bottomAnim;
    private ImageView Logo;
    private TextView Title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_welcome);

        initializeUIViews();

        Logo.setAnimation(topAnim);
        Title.setAnimation(bottomAnim);

        new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    startActivity(new Intent(WelcomeScreenActivity.this, DashboardActivity.class));
                    finish();
                }
            },SPLASH_SCREEN_DELAY);
    }

    private void initializeUIViews(){
        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_anim);
        bottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_anim);
        Logo = (ImageView)findViewById(R.id.ivMainArtWelcome);
        Title = (TextView)findViewById(R.id.tvTitleWelcome);
    }
}