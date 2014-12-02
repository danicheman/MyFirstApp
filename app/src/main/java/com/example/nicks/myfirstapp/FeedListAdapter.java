package com.example.nicks.myfirstapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Nicks on 12/1/2014.
 */
public class FeedListAdapter extends ArrayAdapter<Feed> {
    public FeedListAdapter(Context context, int resource, List<Feed> items) {
        super(context, resource, items);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) parent.getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.feed_list_item, null, true);
        TextView textView = (TextView) rowView.findViewById(R.id.feed_name);
        textView.setText(objects.get(position).loadLabel(pm));

        return super.getView(position, convertView, parent);
    }
}
