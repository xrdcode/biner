package com.xrdcode.firstapps;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TargetActivity extends AppCompatActivity {

    //private static final String URL = "http://biner.mathunj.org/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_target);

        final FragmentManager fm = getSupportFragmentManager();
        final FragmentTransaction fragmentTransaction = fm.beginTransaction();

        FragmentSatu fragmentSatu = new FragmentSatu();

        fragmentTransaction.add(R.id.targetFragment, fragmentSatu);
        fragmentTransaction.commit();

        Button btnWeb = (Button) findViewById(R.id.idWeb);

        btnWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentSatu fragmentSatu = new FragmentSatu();
                FragmentTransaction fragmentTransaction = fm.beginTransaction();
                fragmentTransaction.replace(R.id.targetFragment, fragmentSatu);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        Button btnLogo = (Button) findViewById(R.id.idLogo);
        btnLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentDua fragmentDua = new FragmentDua();
                FragmentTransaction fragmentTransaction = fm.beginTransaction();
                fragmentTransaction.replace(R.id.targetFragment, fragmentDua);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
        /*

        */
    }
}
