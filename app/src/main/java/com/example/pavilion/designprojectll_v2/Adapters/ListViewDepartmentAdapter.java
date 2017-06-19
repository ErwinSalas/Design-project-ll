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
import java.util.List;

import Models.Department;

/**
 * Created by Pavilion on 29/5/2017.
 */
public class ListViewDepartmentAdapter extends ArrayAdapter<Department> {

    private final Activity context;
    private List<Department> properties;


    public ListViewDepartmentAdapter(Activity context, List<Department> properties) {
        super(context, R.layout.list_property_item, properties);
        this.context = context;
        this.properties = properties;

    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.list_property_item, null, true);


        TextView name = (TextView) rowView.findViewById(R.id.textViewNombre);
        TextView direccion = (TextView) rowView.findViewById(R.id.textViewDireccion);
        TextView description = (TextView) rowView.findViewById(R.id.textViewDescripcion);
        RatingBar calificacion = (RatingBar) rowView.findViewById(R.id.ratingBar);
        TextView price = (TextView) rowView.findViewById(R.id.textViewMonto);


        name.setText(properties.get(position).getName());
        description.setText(properties.get(position).getDescription());
        direccion.setText(properties.get(position).getAddress());
        calificacion.setRating(properties.get(position).getRate());
        price.setText((String.valueOf(properties.get(position).getPayment_amount())));

        return rowView;
    }
}