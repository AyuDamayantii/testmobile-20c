package com.ayudamayanti.pmsi20c;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DuaFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DuaFragment extends Fragment {
    //deklarasi variabel komponen
    TextView txt_content_fragment2;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public DuaFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DuaFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static DuaFragment newInstance(String param1, String param2) {
        DuaFragment fragment = new DuaFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //deklrasi & definisi variabel view

        View vw = inflater.inflate(R.layout.fragment_dua, container, false)

        //definisi variabel komponen
        txt_content_fragment2 = vw.findViewById(R.id.txt_content_fragment2);

        //isi nilai

        txt_content_fragment2.setText(this.getArguments().getString("isi"));
       // Isi nilai txt_content_fragment2
        txt_content_fragment2.setText(this.getArguments().get("pesan"));

        txt_content_fragment2.setText("Ini Fragment 2");


        // Inflate the layout for this fragment
        return vw;
    }
}