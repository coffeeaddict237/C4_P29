package com.example.saraglattstein.c4_p29;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private TextView tvLang;
    private TextView tvTrans;

    private String language;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvLang = findViewById(R.id.tvLang);
        tvTrans = findViewById(R.id.tvTrans);

        language = getIntent().getStringExtra("LANG");
        tvLang.setText(language);

        String result;

        if(language.equals(getString(R.string.Spanish))) {
            result = getString(R.string.Spn);
        }
        else if(language.equals(getString(R.string.French))) {
            result = getString(R.string.Fr);
        }
        else if(language.equals(getString(R.string.Italian))) {
            result = getString(R.string.It);
        }
        else if(language.equals(getString(R.string.Portuguese))) {
            result = getString(R.string.Prt);
        }
        else if(language.equals(getString(R.string.German))) {
            result = getString(R.string.Gr);
        }
        else{
            result = "Hello World";
        }
        tvTrans.setText(result);
    }
}
