package com.example.android.themepixli;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import java.util.List;

/**
 * Created by ahmedraza on 24/08/16.
 */
public class PixliTeamCustomClassAdapter extends ArrayAdapter<PixliTeamCustomClass> {

    public PixliTeamCustomClassAdapter (Activity context, List<PixliTeamCustomClass> photoCollection){
        super(context,0 ,photoCollection);
    }

    public View getView(int position, View convertView, ViewGroup parent){

        PixliTeamCustomClass pixliCollection = getItem(position);
        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.grid_view_holder, parent, false);
        }

        ImageView pixlipic = (ImageView) convertView.findViewById(R.id.imageHolder);
        pixlipic.setImageResource(pixliCollection.picTeam);


        return convertView;
    }


       }

