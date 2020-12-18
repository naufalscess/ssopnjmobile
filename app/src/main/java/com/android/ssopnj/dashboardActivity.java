package com.android.ssopnj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class dashboardActivity extends AppCompatActivity {
    private ImageView nearbyMenu;
    private ImageView contactMenu;
    private ImageView searchMenu, aboutMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        contactMenu= (ImageView) findViewById(R.id.imageView5);
        contactMenu.setOnClickListener(this);
        searchMenu= (ImageView) findViewById(R.id.imageView3);
        searchMenu.setOnClickListener(this);
        aboutMenu = (ImageView) findViewById(R.id.imageView6);
        aboutMenu.setOnClickListener(this);


    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
                break;
        }
    }
}
