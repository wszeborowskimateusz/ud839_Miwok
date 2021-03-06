package com.example.android.miwok;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Mateusz on 10/09/2017.
 */

public class WordAdapter extends ArrayAdapter<Word>{


    /*Id of the background color of each category*/
    private int mColorResourceId;


    public WordAdapter(Activity context, ArrayList<Word> list, int color) {
        super(context,0,list);
        this.mColorResourceId = color;
    }

    @Override
    public View getView(int position, final View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        final Word currentWord = getItem(position);


        // Find the TextView in the list_item.xml layout with the ID miwok_text_view
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        // Get the miwok translation from the current Word object and
        // set this text on the name TextView
        miwokTextView.setText(currentWord.getMiwokTranslation());

        // Find the TextView in the list_item.xml layout with the ID default_text_view
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        // Get the default translation from the current Word object and
        // set this text on the number TextView
        defaultTextView.setText(currentWord.getDefaultTranslation());

        // Find the ImageView in the list_item.xml layout with the ID image
        ImageView imageView = (ImageView)listItemView.findViewById(R.id.image);

        if(currentWord.hasImage()){
            // Get the resource id from the current Word object and
            // set this image on the number ImageView
            imageView.setImageResource(currentWord.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        }
        else{
            /*Hide the view*/
            imageView.setVisibility(View.GONE);
        }

        /*Setting background color depend on activity*/
        LinearLayout layout = (LinearLayout) listItemView.findViewById(R.id.text_container);
        layout.setBackgroundColor(this.mColorResourceId);


        return listItemView;
    }
}
