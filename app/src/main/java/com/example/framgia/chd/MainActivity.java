package com.example.framgia.chd;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    private Spinner mGenderSpinner;
    private EditText mEdtName, mEdtAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        mEdtName = (EditText) findViewById(R.id.input_name);
        mEdtAge = (EditText) findViewById(R.id.input_age);
        // set up gender spinner
        String[] genders = {"Male", "Female"};
        mGenderSpinner = (Spinner) findViewById(R.id.spinner_gender);
        ArrayAdapter<String> genderAdapter = new ArrayAdapter<>
            (
                this,
                android.R.layout.simple_spinner_item,
                genders
            );
        mGenderSpinner.setAdapter(genderAdapter);
    }
}
