package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;
//import androidx.fragment.app.Fragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.Fragment;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button firstFragment,secondFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstFragment=(Button)  findViewById(R.id.firstFragment);
        secondFragment=(Button) findViewById(R.id.secondFragment);

        firstFragment.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //load first fragment
                loadFragment(new Fragment1());
            }
        });
        secondFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //load second fragment
                loadFragment(new Fragment2());
            }
        });
    }
    private void loadFragment(Fragment fragment){
        //create a fragment manager
        FragmentManager fm=getFragmentManager();
        //create a FragmentTransaction to begin the transaction and replace the fragment
        FragmentTransaction fragmentTransaction=fm.beginTransaction();
        //replace the FrameLayout with new Fragment
        fragmentTransaction.replace(R.id.frameLayout,fragment);
        fragmentTransaction.commit(); //saves the changes
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        /* Inflate the menu; this adds items to the action bar if it is present */
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        /* Handle action bar item clicks here. The action bar will automatically handle clicks on the Home/Up button, so long as you specify a parent activity in the AndroidManifest.xml */
        int id=item.getItemId();
        //noinspection SimplifiableIfStatement
        if(id==R.id.action_settings){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
