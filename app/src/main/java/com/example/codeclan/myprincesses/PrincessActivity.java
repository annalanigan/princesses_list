package com.example.codeclan.myprincesses;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PrincessActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_princess);

        Intent intent = getIntent();
        Princess princess = (Princess) intent.getSerializableExtra("princess");

//        TextView name = findViewById(R.id.princess);
//        name.setText(princess.getName());
//
//        TextView movie = findViewById(R.id.movie);
//        movie.setText(princess.getMovie());
//
//        TextView ranking = findViewById(R.id.data);
//        ranking.setText(princess.getData().toString());

    }
}
