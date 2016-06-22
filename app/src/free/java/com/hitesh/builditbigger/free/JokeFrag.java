package com.hitesh.builditbigger.free;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hitesh.builditbigger.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class JokeFrag extends Fragment {


    public JokeFrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_joke, container, false);
        return  view;
    }

}
