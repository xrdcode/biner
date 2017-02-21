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
    private static final String TAG = "BINER DEBUG: ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "Ini onCreate");

        /* TODO: Register button on activity_main */

        /* TODO: Register editText username & password on activity_main */

        /* TODO: Register checkBox on activity_main */

        /* TODO: Implement OnCheckedChangeListener for checkBox */

        /* TODO: Implement OnClickListener for button */
    }

    /* TODO: Implement onResume, onPause, onStart, onRestart, onStop, onDestroy */

}
