package Models;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.pavilion.designprojectll_v2.R;

import java.util.ArrayList;

/**
 * Created by Pavilion on 29/5/2017.
 */
public class ListViewCustomAdapter  extends ArrayAdapter<Property> {

    private final Activity context;
    private ArrayList<Property> properties;


    public ListViewCustomAdapter(Activity context, ArrayList<Property> properties) {
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
        direccion.setText(properties.get(position).getdireccion());
        calificacion.setRating(properties.get(position).getCalification());
        price.setText((String.valueOf(properties.get(position).getAmout())));

        return rowView;
    }
}