package com.example.basicval;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.internal.TextWatcherAdapter;

import java.util.regex.Matcher;

public class MainActivity extends AppCompatActivity {
        EditText phoneNumber;
        EditText password;
        Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        phoneNumber = (EditText) findViewById(R.id.editTextPhone);
        password = (EditText) findViewById(R.id.editTextTextPassword);
        login = (Button) findViewById(R.id.login);


    phoneNumber.addTextChangedListener(new TextWatcherAdapter(){
                @Override
                public void beforeTextChanged CharSequence charSequence, int i, int i1, int i2){
        }
                @Override
                public void onTextChanged CharSequence charSequence, int i,int i1,int i2){
                    if (Validate phoneNumber((phoneNumber.getText().toString()) {
                        phoneNumber.set Enebled (true);
                        password.set Error("Invalid Mobile No");
                    }

                    }
                    @Override
              public  void afterTextchanged(Editable editable) {
        }
    });
    }
    boolean Validate Mobile (String input){
        pattern p = pattern.compile("[5-9][0-9]{12}");
        Matcher m= p.matcher(input);
        return m.matches();
    }
}



