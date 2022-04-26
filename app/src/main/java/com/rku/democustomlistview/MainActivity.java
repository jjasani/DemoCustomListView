package com.rku.democustomlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    MyAdapter adapter;
    ArrayList<Item> itemlist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.lstData);
        ArrayList<Item> items = new ArrayList<Item>();

        // 1. pass context and data to the custom adapter
        adapter = new MyAdapter(this, generateData());
        listView.setAdapter(adapter);
    }
    private ArrayList<Item> generateData() {
        ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item("Item 1", "First Item on the list", R.drawable.number_0));
        items.add(new Item("Item 2", "Second Item on the list", R.drawable.number_1));
        items.add(new Item("Item 3", "Third Item on the list", R.drawable.number_2));
        return items;
    }
}