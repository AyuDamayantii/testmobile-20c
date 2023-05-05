package com.uti.pmsi20c;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ayudamayanti.pmsi20c.R;
import com.ayudamayanti.pmsi20c.SatuFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //tampilkan fragment 1 (SatuFragment.java)
        //.replace (nama komponen frame, nama fragment)
        getSupportFragmentManager().beginTransaction().replace(R.id.fl_fragment, new SatuFragment()).commit();

    }
}