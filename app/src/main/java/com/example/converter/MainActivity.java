package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtNomor;
    Button btnKonversi;
    TextView txtBin, txtOct, txtHex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNomor = findViewById(R.id.edtNomor);
        btnKonversi = findViewById(R.id.btnKonversi);
        txtBin = findViewById(R.id.txtBin);
        txtOct = findViewById(R.id.txtOct);
        txtHex = findViewById(R.id.txtHex);

        btnKonversi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int dec = Integer.parseInt(edtNomor.getText().toString());

                    String bin = Integer.toBinaryString(dec);
                    String oct = Integer.toOctalString(dec);
                    String hex = Integer.toHexString(dec);

                    txtBin.setText(bin);
                    txtOct.setText(oct);
                    txtHex.setText(hex);

                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(), "Error! Angka melebihi batas" +
                            " / mungkin belum di isi", Toast.LENGTH_SHORT).show();
                }


            }
        });

    }
}