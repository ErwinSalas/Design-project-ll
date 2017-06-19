package com.example.pavilion.designprojectll_v2.Adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.pavilion.designprojectll_v2.R;

import java.util.ArrayList;

import Models.Comments;

/**
 * Created by Pavilion on 18/6/2017.
 */
public class ListViewCommentsAdapter extends ArrayAdapter<Comments> {

    private final Activity context;
    private ArrayList<Comments> comments;


    public ListViewCommentsAdapter(Activity context, ArrayList<Comments> comments) {
        super(context, R.layout.list_comment_item, comments);
        this.context = context;
        this.comments = comments;

    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.list_property_item, null, true);


        TextView name = (TextView) rowView.findViewById(R.id.textViewNombre);
        TextView comment = (TextView) rowView.findViewById(R.id.textViewComment);
        TextView date = (TextView) rowView.findViewById(R.id.textViewFecha);
        RatingBar rate = (RatingBar) rowView.findViewById(R.id.ratingBar);



        name.setText(comments.get(position).getPosterUserName() );
        comment.setText(comments.get(position).getMessage());
        date.setText(comments.get(position).getdate());
        rate.setRating(comments.get(position).getRate());

        return rowView;
    }
}
