package com.rku.democustomlistview;

import java.util.ArrayList;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MyAdapter extends ArrayAdapter<Item> {

    private final Context context;
    private final ArrayList<Item> list;

    private final int[] images = {
            R.drawable.number_0,
            R.drawable.number_1,
            R.drawable.number_2
    };

    MyAdapter(Context context, ArrayList<Item> list) {
        super(context, R.layout.listitem, list);
        this.context = context;
        this.list = list;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // 1. Create inflater
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // 2. Get rowView from inflater
        View rowView = inflater.inflate(R.layout.listitem, parent, false);

        // 3. Get the two text view from the rowView
        TextView labelView = (TextView) rowView.findViewById(R.id.label);
        TextView valueView = (TextView) rowView.findViewById(R.id.value);
        ImageView imgView = (ImageView) rowView.findViewById(R.id.imageView);

        // 4. Set the text for textView
        labelView.setText(list.get(position).getTitle());
        valueView.setText(list.get(position).getDescription());
        imgView.setBackgroundResource(images[position]);
        // 5. retrn rowView
        return rowView;
    }
}
