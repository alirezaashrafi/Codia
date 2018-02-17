package com.alirezaashrafi.codia;

import android.content.ClipboardManager;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.alirezaashrafi.library.Codia;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;

import javax.crypto.Cipher;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        final Codia codia = new Codia("Your Own Private Key");
        String text = "Easy and Fast android - php - java Encryption Decryption library";
        final String encoded = codia.encode(text);
        String decoded = codia.decode(encoded);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                final Codia codia = new Codia(edtKey.getText().toString());

                String resString = edt.getText().toString();
                edt.setText("");
                if (radioEncrypt.isChecked()) {
                    resString = codia.encode(resString);
                } else if (radioDecrypt.isChecked()) {
                    resString = codia.decode(resString);
                }
                res.setText(resString);
            }
        });
        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager cm = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                cm.setText(res.getText());
                Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT).show();
            }
        });

    }

    private EditText edtKey;
    private EditText edt;
    private RadioButton radioEncrypt;
    private RadioButton radioDecrypt;
    private TextView res;
    private Button btn;

    public void initViews() {
        edtKey = (EditText) findViewById(R.id.edtKey);
        edt = (EditText) findViewById(R.id.edt);
        radioEncrypt = (RadioButton) findViewById(R.id.radioEncrypt);
        radioDecrypt = (RadioButton) findViewById(R.id.radioDecrypt);
        res = (TextView) findViewById(R.id.res);
        btn = (Button) findViewById(R.id.btn);
    }
}
