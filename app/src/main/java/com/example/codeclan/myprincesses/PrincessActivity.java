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

        TextView name = findViewById(R.id.name);
        TextView movie = findViewById(R.id.movie);
        TextView data = findViewById(R.id.data);

        Intent intent = getIntent();
//        Bundle extras = intent.getExtras();

        Princess princess = (Princess) intent.getSerializableExtra("princess");

        name.setText(princess.getName());
        movie.setText(princess.getMovie());
        data.setText(princess.getData());

    }
}
