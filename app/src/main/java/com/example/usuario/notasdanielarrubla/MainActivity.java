package com.example.usuario.notasdanielarrubla;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText N1;
    EditText N2;
    EditText N3;
    EditText N4;
    EditText NFinal;
    double prom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        N1=(EditText)findViewById(R.id.editText6);
        N2=(EditText)findViewById(R.id.editText7);
        N3=(EditText)findViewById(R.id.editText8);
        N4=(EditText)findViewById(R.id.editText9);
        NFinal=(EditText)findViewById(R.id.editText10);
    }

    public void calcular(View view) {
        Double s1, s2, s3, s4, sf;
        if ((TextUtils.isEmpty(N1.getText())) && (TextUtils.isEmpty(N1.getText())) && (TextUtils.isEmpty(N1.getText())) && (TextUtils.isEmpty(N1.getText()))) {

            s1=s2=s3=s4=3.8;

            String out1 = String.valueOf(s1);
            N1.setText(out1);
            String out2 = String.valueOf(s2);
            N2.setText(out2);
            String out3 = String.valueOf(s3);
            N3.setText(out3);
            String out4 = String.valueOf(s4);
            N4.setText(out4);

            sf = (s1 + s2 + s3 + s4) / 4;
            String out = String.valueOf(sf);
            NFinal.setText(out);
        } else {
            if (TextUtils.isEmpty(N1.getText())) {
                s2 = Double.valueOf(N2.getText().toString());
                s3 = Double.valueOf(N3.getText().toString());
                s4 = Double.valueOf(N4.getText().toString());
                s1 = (3.8 * 4) - s2 - s3 - s4;

                String out = String.valueOf(s1);
                N1.setText(out);

                sf = (s1 + s2 + s3 + s4) / 4;
                String out1 = String.valueOf(sf);
                NFinal.setText(out1);
            } else {
                if (TextUtils.isEmpty(N2.getText())) {
                    s1 = Double.valueOf(N1.getText().toString());
                    s3 = Double.valueOf(N3.getText().toString());
                    s4 = Double.valueOf(N4.getText().toString());
                    s2 = (3.8 * 4) - s1 - s3 - s4;

                    String out = String.valueOf(s2);
                    N2.setText(out);

                    sf = (s1 + s2 + s3 + s4) / 4;
                    String out1 = String.valueOf(sf);
                    NFinal.setText(out1);
                } else {
                    if (TextUtils.isEmpty(N3.getText())) {
                        s2 = Double.valueOf(N2.getText().toString());
                        s1 = Double.valueOf(N1.getText().toString());
                        s4 = Double.valueOf(N4.getText().toString());
                        s3 = (3.8 * 4) - s2 - s1 - s4;

                        String out = String.valueOf(s3);
                        N3.setText(out);

                        sf = (s1 + s2 + s3 + s4) / 4;
                        String out1 = String.valueOf(sf);
                        NFinal.setText(out1);
                    } else {
                        if (TextUtils.isEmpty(N4.getText())) {
                            s2 = Double.valueOf(N2.getText().toString());
                            s3 = Double.valueOf(N3.getText().toString());
                            s1 = Double.valueOf(N1.getText().toString());
                            s4 = (3.8 * 4) - s2 - s3 - s1;


                            String out = String.valueOf(s4);
                            N4.setText(out);

                            sf = (s1 + s2 + s3 + s4) / 4;
                            String out1 = String.valueOf(sf);
                            NFinal.setText(out1);
                        } else {
                            s1 = Double.valueOf(N1.getText().toString());
                            s2 = Double.valueOf(N2.getText().toString());
                            s3 = Double.valueOf(N3.getText().toString());
                            s4 = Double.valueOf(N4.getText().toString());

                            sf = (s1 + s2 + s3 + s4) / 4;
                            String out = String.valueOf(sf);
                            NFinal.setText(out);
                        }
                    }
                }
            }


        }
    }
}
