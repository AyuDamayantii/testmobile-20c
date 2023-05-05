package com.ayudamayanti.pmsi20c;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //deklarasi komponen
    EditText edt_nilai1,edt_nilai2, edt_hasil;
    Button btn_tambah, btn_kurang, btn_kali, btn_bagi;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //definisi Komponen
        edt_nilai1 = findViewById(R.id.edt_nilai1);
        edt_nilai2 = findViewById(R.id.edt_nilai2);
        edt_hasil = findViewById(R.id.edt_hasil);

        btn_tambah = findViewById(R.id.btn_tambah);
        btn_kurang = findViewById(R.id.btn_kurang);
        btn_kali = findViewById(R.id.btn_kali);
        btn_bagi = findViewById(R.id.btn_bagi);

        //buat event/proses
        btn_tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //deklarasi variabel untuk "input" dan "output"
                int nilai1, nilai2, hasil = 0;

                //jika salah satu komponen input ("edt_nilai1" dan "edt_nilai2") tidak diisi
                if (edt_nilai1.getText().toString().isEmpty() || edt_nilai2.getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Nilai 1 dan Nilai 2 Wajib Diisi", Toast.LENGTH_SHORT).show();
                }

                //jika seluruh komponen input ("edt_nilai1" dan "edt_nilai2") diisi
                else
                {

                    //ambil nilai "input" dari "edt_nilai1" dan "edt_nilai2"
                    nilai1 = Integer.parseInt(edt_nilai1.getText().toString());
                    nilai2 = Integer.parseInt(edt_nilai2.getText().toString());

                    
                    //proses
                    hasil = nilai1 + nilai2;
                }

                


            //output

                edt_hasil.setText(Integer.toString(hasil));
            }
        });
    }
}