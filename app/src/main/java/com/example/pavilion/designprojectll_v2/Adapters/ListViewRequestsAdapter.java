package com.example.pavilion.designprojectll_v2.Adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.pavilion.designprojectll_v2.R;

import java.util.List;

import Models.Department;
import Models.RentRequest;

/**
 * Created by Pavilion on 18/6/2017.
 */
public class ListViewRequestsAdapter extends ArrayAdapter<RentRequest> {

    private final Activity context;
    private List<RentRequest> requests;


    public ListViewRequestsAdapter(Activity context, List<RentRequest> requests) {
        super(context, R.layout.list_property_item, requests);
        this.context = context;
        this.requests = requests;

    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.list_request_item, null, true);


        TextView name = (TextView) rowView.findViewById(R.id.textViewNombre);
        TextView applicant = (TextView) rowView.findViewById(R.id.textViewNombreSolicitante);
        TextView department = (TextView) rowView.findViewById(R.id.textViewNombreDepatamento);



        name.setText(requests.get(position).getApplicant_name());
        applicant.setText(requests.get(position).getApplicant_name());
        department.setText(requests.get(position).getDepartment_name());


        return rowView;
    }

}
