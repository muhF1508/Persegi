package com.example.mbarrafirdaus.persegi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    //Deklarasi variable komponen
    EditText p, l;
    Button hitung;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Deklarasi yang dikaitkan dengan ID Komponen
        p =  (EditText)findViewById(R.id.Panjang);
        l =  (EditText)findViewById(R.id.Lebar);
        hitung = (Button)findViewById(R.id.button);
        hasil = (TextView)findViewById(R.id.txt_hasil);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(p.length()== 0 && l.length()== 0){
                    Toast.makeText(getApplication(),"Panjang dan Tinggi tidak boleh kosong",Toast.LENGTH_LONG).show();
                }
                //notifikasi ini akan muncul jika panjangnya diisi
                else if (p.length()== 0){
                    Toast.makeText(getApplication(),"Panjang tidak boleh kosong",Toast.LENGTH_LONG).show();
                }
                //notifikasi jika lebar tidak diisi
                else if (l.length()== 0){
                    Toast.makeText(getApplication(),"Lebar tidak boleh kosong",Toast.LENGTH_LONG).show();
                }
                else{
                    //Deklarasi Variable perhitungan
                    String isipanjang = p.getText().toString();
                    String isilebar = l.getText().toString();
                    double p = Double.parseDouble(isipanjang);
                    double l = Double.parseDouble(isilebar);
                    double hs = persegi (p, l);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());

                }
            }
        });
    }
    public double persegi (double p, double l) {
        return p*l;
    }
}
