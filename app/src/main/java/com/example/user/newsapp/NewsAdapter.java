package com.example.user.newsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by USER on 11/25/2017.
 */

public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter (Context context, List<News> news){
        super(context,0,news);
    }
    @Override
    public View getView (int position, View convertView, ViewGroup parent){
        View listItemView = convertView;
        if(listItemView==null){
            listItemView= LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item,parent,false);
        }

        News currentNews = getItem(position);

        TextView theTitle = (TextView) listItemView.findViewById(R.id.title);
        TextView theAuthor= (TextView) listItemView.findViewById(R.id.author);
        TextView theSection = (TextView) listItemView.findViewById(R.id.section);
        TextView theDate = (TextView) listItemView.findViewById(R.id.date);

        theTitle.setText(currentNews.getTitle());
        theAuthor.setText(currentNews.getAuthor());
        theSection.setText(currentNews.getSection());
        theDate.setText(currentNews.getDate());
        return listItemView;
    }
}
