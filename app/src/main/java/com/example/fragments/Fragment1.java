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


public class Fragment1 extends Fragment {
    View view;
    Button firstButton;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        //Inflate the layout for this fragment
        view=inflater.inflate(R.layout.fragment1,container,false);
        //get the reference of Button
        firstButton=(Button) view.findViewById(R.id.firstButton);
        //perform setOnclickListener on first button
        firstButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //display a message by using a Toast
                Toast.makeText(getActivity(),"First Fragment",Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }


}
