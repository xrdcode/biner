package com.xrdcode.firstapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.util.Log; //import ini
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //tulis ini :
    private static final String TAG = "BINER DEBUG: ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "Ini onCreate");

        Button btn = (Button) findViewById(R.id.button);

        final EditText username = (EditText) findViewById(R.id.editUname);
        final EditText password = (EditText) findViewById(R.id.editPass);

        CheckBox cb = (CheckBox) findViewById(R.id.checkBox);

        cb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(!b) {
                    password.setTransformationMethod(
                            PasswordTransformationMethod.getInstance());
                } else {
                    password.setTransformationMethod(
                            HideReturnsTransformationMethod.getInstance());
                }
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String uname = username.getText().toString();
                String pass = password.getText().toString();
                if(uname.equals("BINER") && pass.equals("0010")) {
                    Intent i = new Intent(getApplicationContext(), TargetActivity.class);
                    startActivity(i);
                } else {
                    Toast.makeText(getApplicationContext(),
                            "Invalid username or password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "Ini onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "Ini onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "Ini onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "Ini onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "Ini onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "Ini onRestart");
    }


}
