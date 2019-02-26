package com.example.android.miwok;


import android.app.Activity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Activity context, ArrayList<Word> words){
        super(context,0,words);
    }

    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        View ListItemView = convertView;
        if(ListItemView==null){
            ListItemView= LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        Word currentWord =  getItem(position);
        TextView miwokTextView = (TextView)ListItemView.findViewById(R.id.miwokView);
        miwokTextView.setText(currentWord.getMiwokTranslation());

        TextView EnglishTextView = (TextView)ListItemView.findViewById(R.id.englishView);
        EnglishTextView.setText(currentWord.getDefaultTranslation());

        return ListItemView;
    }
}
