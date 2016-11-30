package com.example.framgia.chd;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.EditText;

import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;

public class MainActivity extends AppCompatActivity {
    private MaterialBetterSpinner mGenderSpinner;
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
        String[] genders = getResources().getStringArray(R.array.genders);
        mGenderSpinner = (MaterialBetterSpinner) findViewById(R.id.spinner_gender);
        ArrayAdapter<String> genderAdapter = new ArrayAdapter<>
            (
                this,
                android.R.layout.simple_dropdown_item_1line,
                genders
            );
        mGenderSpinner.setAdapter(genderAdapter);
    }
}
