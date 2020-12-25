package com.android.ssopnj;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class dashboardActivity extends AppCompatActivity {
    private ImageView contactMenu;
    private ImageView searchMenu, aboutMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        contactMenu= (ImageView) findViewById(R.id.imageView5);
        contactMenu.setOnClickListener((View.OnClickListener) this);
        searchMenu= (ImageView) findViewById(R.id.imageView3);
        searchMenu.setOnClickListener((View.OnClickListener) this);
        aboutMenu = (ImageView) findViewById(R.id.imageView6);
        aboutMenu.setOnClickListener((View.OnClickListener) this);


    }
}
