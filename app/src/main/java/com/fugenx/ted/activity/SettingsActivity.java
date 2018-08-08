package com.fugenx.ted.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.fugenx.ted.R;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp(){
        onBackPressed();
        finish();
        return true;
    }
}
