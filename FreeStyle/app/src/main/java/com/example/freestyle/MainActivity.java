package com.example.freestyle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    static ListView listview;
    static ArrayList<String> items;
    static ListViewAdapter adapter;

    EditText input;
    ImageView enter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview = findViewById(R.id.listView);
        input=findViewById(R.id.input);
        enter=findViewById(R.id.add);


        items= new ArrayList<>();
        items.add("Apple");
        items.add("Banana");
        items.add("Orange");
        items.add("Strawberry");
        items.add("Eggs");
        items.add("Milk");
        items.add("Kiwi");
        items.add("Chicken");
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String name= items.get(i);
                makeToast(name);
            }
        });
        listview.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                makeToast("Removed:"+items.get(i));
                RemoveItem(i);
                return false;
            }
        });
        adapter=new ListViewAdapter(getApplicationContext(),items);
        listview.setAdapter(adapter);
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text= input.getText().toString();
                if(text == null || text.length()==0){
                    makeToast("Enter an item");
                }else{
                    addItem(text);
                    input.setText("");
                    makeToast("Added:"+ text);
                }
            }
        });


    }
    public static void RemoveItem(int remove){
        items.remove(remove);
        //adapter.notifyDataSetChanged();
        listview.setAdapter(adapter); //another way
    }
    public static void addItem(String item){
        items.add(item);
        listview.setAdapter(adapter);
    }
    Toast t;
    private void makeToast(String s){
        if(t != null) t.cancel();
        t= Toast.makeText(getApplicationContext(),s,Toast.LENGTH_SHORT);
        t.show();

    }
}