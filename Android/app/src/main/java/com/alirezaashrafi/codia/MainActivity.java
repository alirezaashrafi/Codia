package com.alirezaashrafi.codia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.alirezaashrafi.library.Codia;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String text = "Easy and Fast android - php - java Encryption Decryption library";

        String encodedText = Codia.encode(text);
        String decodedText = Codia.decode(encodedText);
    }
}
