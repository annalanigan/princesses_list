package com.example.codeclan.myprincesses;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class TopPrincessActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.princess_list);

        TopPrincesses topPrincesses = new TopPrincesses();
        ArrayList<Princess> list = topPrincesses.getList();

        TopPrincessAdapter princessAdapter = new TopPrincessAdapter(this, list);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(princessAdapter);

    }

    public void getPrincess(View listItem){
        Princess princess = (Princess) listItem.getTag();

        Intent intent = new Intent(this, PrincessActivity.class);
        intent.putExtra("princess", princess);

        startActivity(intent);

    }

}
