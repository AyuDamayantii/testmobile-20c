package com.ayudamayanti.pmsi20c;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class mainactivity extends AppCompatActivity {
    //deklarasi variable komponen
    Button btn_fragment1,btn_fragment2,btn_fragment3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //definisi variable komponen
        btn_fragment1 = btn_fragment1.findViewById(R.id.btn_fragment1);
        btn_fragment2 = btn_fragment2.findViewById(R.id.btn_fragment3);
        btn_fragment3 = btn_fragment3.findViewById(R.id.btn_fragment3);

        //tampilkan Fragment1 (SatuFragment.java)
        // replace(nama komponen frame,nama fragment)
        getSupportFragmentManager().beginTransaction().replace(R.id.fl_fragment,new DuaFragment()).commit();

        setTitle("Fragment 1");

    }
}