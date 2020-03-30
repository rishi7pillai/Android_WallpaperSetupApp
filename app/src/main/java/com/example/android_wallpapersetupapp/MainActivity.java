package com.example.android_wallpapersetupapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.WallpaperManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn_setWallpaper(View view) {


        Bitmap bitmap =BitmapFactory.decodeResource(getResources(),R.drawable.one);

        WallpaperManager wallpaperManager=WallpaperManager.getInstance(getApplicationContext());

        try
        {
            wallpaperManager.setBitmap(bitmap);
            Toast.makeText(this, "Wallpaper Set", Toast.LENGTH_SHORT).show();

        }



        catch (IOException e)
        {
            Toast.makeText(this, "Wallpaper Not Set", Toast.LENGTH_SHORT).show();
        }
    }
    }

