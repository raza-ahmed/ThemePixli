package com.example.android.themepixli;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.Arrays;

/**
 * Created by ahmedraza on 25/08/16.
 */
public class Main2ActivityFragment extends Fragment {

    public Main2ActivityFragment(){

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        View rootView = inflater.inflate(R.layout.main2_activity_fragment, container, false);



        PixliTeamCustomClass[] picArray = {
                new PixliTeamCustomClass(R.drawable.headlight),
                new PixliTeamCustomClass(R.drawable.pixli4),
                new PixliTeamCustomClass(R.drawable.pixli1),
                new PixliTeamCustomClass(R.drawable.bike_ssj),
                new PixliTeamCustomClass(R.drawable.pixli10),
                new PixliTeamCustomClass(R.drawable.pixli2),
                new PixliTeamCustomClass(R.drawable.pixli5),
                new PixliTeamCustomClass(R.drawable.pixli4)

        };

        PixliTeamCustomClassAdapter pixliAdapter = new PixliTeamCustomClassAdapter(getActivity(), Arrays.asList(picArray));
        GridView gridView = (GridView) rootView.findViewById(R.id.gidViewhold);
        gridView.setAdapter(pixliAdapter);

        return rootView;
    }
}
