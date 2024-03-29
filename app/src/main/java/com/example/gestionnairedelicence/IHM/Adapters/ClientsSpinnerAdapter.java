package com.example.gestionnairedelicence.IHM.Adapters;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.example.gestionnairedelicence.METIER.CLIENT;

import java.util.ArrayList;

public class ClientsSpinnerAdapter extends ArrayAdapter<CLIENT> {
    // Your custom values for the spinner (User)
    private final ArrayList<CLIENT> values;

    public ClientsSpinnerAdapter(Context context, int textViewResourceId, ArrayList<CLIENT> values) {
        super(context, textViewResourceId, values);
        // Your sent context
        this.values = values;
    }

    @Override
    public int getCount() {
        return values.size();
    }

    @Override
    public CLIENT getItem(int position) {
        return values.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    // And the "magic" goes here
    // This is for the "passive" state of the spinner
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // I created a dynamic TextView here, but you can reference your own  custom layout for each spinner item
        TextView label = (TextView) super.getView(position, convertView, parent);
        label.setTextColor(Color.BLACK);
        // Then you can get the current item using the values array (Users array) and the current position
        // You can NOW reference each method you have created in your bean object (User class)
        label.setText(values.get(position).toString());

        // And finally return your dynamic (or custom) view for each spinner item
        return label;
    }
}
