package com.juantrc.multi_intents;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button intent1 = findViewById(R.id.intent1);
        Button intent2 = findViewById(R.id.intent2);
        Button intent3 = findViewById(R.id.intent3);
        Button intent4 = findViewById(R.id.intent4);
        Button intent5 = findViewById(R.id.intent5);
        Button intent6 = findViewById(R.id.intent6);

        intent1.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, intent1.class);

            startActivity(intent);
        });

        intent2.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, intent2.class);

            startActivity(intent);
        });

        intent3.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, intent3.class);

            startActivity(intent);
        });

        intent4.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nasa.gov/"));

            startActivity(intent);
        });

        intent5.setOnClickListener(v -> {
            Intent searchIntent = new Intent(Intent.ACTION_WEB_SEARCH);

            searchIntent.putExtra(SearchManager.QUERY, "TON-618");

            startActivity(searchIntent);
        });

        intent6.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=uD4izuDMUQA&pp=ygUMbWVsb2R5IHNoZWVw"));

            startActivity(intent);
        });
    }
}