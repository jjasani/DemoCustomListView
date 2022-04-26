package com.rku.democustomlistview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<Item> {
    ArrayList<Item> list;
    public CustomAdapter(@NonNull Context context, ArrayList<Item> list) {
        super(context,R.layout.listitem);
        this.list = list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        return super.getView(position, convertView, parent);
    }
}
