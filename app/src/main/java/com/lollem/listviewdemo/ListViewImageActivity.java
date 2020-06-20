package com.lollem.listviewdemo;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ListViewImageActivity extends AppCompatActivity {
    ListView lstView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactlistview);
        this.lstView = findViewById(R.id.lstContact);

        AmiciAdapter amiciAdapter = new AmiciAdapter(getApplicationContext());
        lstView.setAdapter(amiciAdapter);
    }
}
