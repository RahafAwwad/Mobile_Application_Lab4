package com.example.freestyle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Activity_Receipes extends AppCompatActivity {

    static ListView lv;

    static ListViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receipe);
        lv=findViewById(R.id.recipeListView);
        List<String> RC=new ArrayList<>();
        RC.add("Chocolate Cake");
        RC.add("Banana Bread");
        RC.add("Spaghetti");
        RC.add("Kiwi Mojito");
        RC.add("Chicken Tacos");
        ArrayAdapter arrayAdapter=new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,RC);
        lv.setAdapter(arrayAdapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String position= RC.get(i);
                //int positionii=Integer.parseInt(position);
                Intent intent = new Intent (Activity_Receipes.this, Activity_Single_Receipe.class);
                intent.putExtra("Receipe_id", position);
                startActivity(intent);

            }
        });

    }
}