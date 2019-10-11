package com.example.fragmentdatapassing;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class MyFragment extends Fragment {
TextView textView1,textView2;

    public MyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_my, container, false);
        textView1=view.findViewById(R.id.t1);
        textView2=view.findViewById(R.id.t2);
        Bundle bundle=getArguments();
        String name=bundle.getString("key1");//here we are getting data in string
        String pass=bundle.getString("key2");
        textView1.setText(name);//now setting data in textview
        textView2.setText(pass);
        return view;
    }

}
