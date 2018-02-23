package com.example.saraglattstein.c4_p29;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn_spn;
    private Button btn_fr;
    private Button btn_it;
    private Button btn_prt;
    private Button btn_gr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_spn = findViewById(R.id.btn_spn);
        btn_fr = findViewById(R.id.btn_fr);
        btn_it = findViewById(R.id.btn_it);
        btn_prt = findViewById(R.id.btn_prt);
        btn_gr = findViewById(R.id.btn_gr);

        btn_spn.setTag(1);
        btn_fr.setTag(2);
        btn_it.setTag(3);
        btn_prt.setTag(4);
        btn_gr.setTag(5);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int tag = (Integer) v.getTag();
                String lang = "";
                switch(tag) {
                    case 1:
                        lang = getString(R.string.Spanish);
                        break;
                    case 2:
                        lang = getString(R.string.French);
                        break;
                    case 3:
                        lang = getString(R.string.Italian);
                        break;
                    case 4:
                        lang = getString(R.string.Portuguese);
                        break;
                    case 5:
                        lang = getString(R.string.German);
                        break;

                }
                Intent intent = new Intent(getBaseContext(), Main2Activity.class);
                intent.putExtra("LANG", lang);
                startActivity(intent);
            }
        };

        btn_spn.setOnClickListener(onClickListener);
        btn_fr.setOnClickListener(onClickListener);
        btn_it.setOnClickListener(onClickListener);
        btn_prt.setOnClickListener(onClickListener);
        btn_gr.setOnClickListener(onClickListener);

    }
}
