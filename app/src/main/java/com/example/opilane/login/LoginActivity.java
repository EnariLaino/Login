package com.example.opilane.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    //deklareeri muutujad
    EditText epost, salasõna;
    Button btn_login;
    TextView katsed, registreeri, unustatud;
    /* täisarvuline muutuja nimega loendaja, mille väärtuseks määrame 3.
     See on selleks, et saaksime kasutajale anda 3 sisselogimis katset */
    int loengaja = 3;
    /* loome firebaseauth muutuja millega saame juurdepääsu firebaseAuthentication klassile*/
    private

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}
