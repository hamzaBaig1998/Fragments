package com.example.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

//import androidx.fragment.app.Fragment;

import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class Fragment2 extends Fragment {

    View view;
    Button secondButton;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        //Inflate the layout for this fragment
        view=inflater.inflate(R.layout.fragment2,container,false);
        //get the reference of Button
        secondButton=(Button) view.findViewById(R.id.secondButton);
        //perform setonclickListener on second Button
        secondButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //display a message by using a toast
                Toast.makeText(getActivity(),"Second Fragment",Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }


}
