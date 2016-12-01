package com.example.framgia.chd;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;

import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;

public class MainActivity extends AppCompatActivity {
    private MaterialBetterSpinner mGenderSpinner, mChestPaintSpinner, mBloodSugarSpinner,
        mEcgSpinner, mExerciseSpinner, mSlopeSpinner, mVesselSpinner, mThalSpinner;
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
        findViewById(R.id.btn_predict).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                startActivity(intent);
            }
        });
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
        // set up chest paint spinner
        mChestPaintSpinner = (MaterialBetterSpinner) findViewById(R.id.spinner_cpt);
        String[] chestPaints = getResources().getStringArray(R.array.chest_paints);
        ArrayAdapter<String> chestPaintAdapter = new ArrayAdapter<>
            (
                this,
                android.R.layout.simple_dropdown_item_1line,
                chestPaints
            );
        mChestPaintSpinner.setAdapter(chestPaintAdapter);
        // setup blood sugar spinner
        mBloodSugarSpinner = (MaterialBetterSpinner) findViewById(R.id.spinner_blood_sugar);
        String[] yesNo = getResources().getStringArray(R.array.yes_no_question);
        mBloodSugarSpinner = (MaterialBetterSpinner) findViewById(R.id.spinner_blood_sugar);
        ArrayAdapter<String> yesNoAdapter = new ArrayAdapter<>
            (
                this,
                android.R.layout.simple_dropdown_item_1line,
                yesNo
            );
        mBloodSugarSpinner.setAdapter(yesNoAdapter);
        // setup ECG
        mEcgSpinner = (MaterialBetterSpinner) findViewById(R.id.spinner_ecg);
        String[] ecgs = getResources().getStringArray(R.array.ecg);
        ArrayAdapter<String> ecgAdapter = new ArrayAdapter<>
            (
                this,
                android.R.layout.simple_dropdown_item_1line,
                ecgs
            );
        mEcgSpinner.setAdapter(ecgAdapter);
        // setup exercise spinner
        mExerciseSpinner = (MaterialBetterSpinner) findViewById(R.id.spinner_exercise);
        mExerciseSpinner.setAdapter(yesNoAdapter);
        // setup slope spinner
        mSlopeSpinner = (MaterialBetterSpinner) findViewById(R.id.spinner_slope);
        String[] slopes = getResources().getStringArray(R.array.slopes);
        ArrayAdapter<String> slopeAdapter = new ArrayAdapter<>
            (
                this,
                android.R.layout.simple_dropdown_item_1line,
                slopes
            );
        mSlopeSpinner.setAdapter(slopeAdapter);
        // setup vessel spinner
        mVesselSpinner = (MaterialBetterSpinner) findViewById(R.id.spinner_vessels);
        String[] vessels = getResources().getStringArray(R.array.vessels);
        ArrayAdapter<String> vesselAdapter = new ArrayAdapter<>
            (
                this,
                android.R.layout.simple_dropdown_item_1line,
                vessels
            );
        mVesselSpinner.setAdapter(vesselAdapter);
        // setup thal spinner
        mThalSpinner = (MaterialBetterSpinner) findViewById(R.id.spinner_thal);
        String[] thals = getResources().getStringArray(R.array.thals);
        ArrayAdapter<String> thalsAdapter = new ArrayAdapter<>
            (
                this,
                android.R.layout.simple_dropdown_item_1line,
                thals
            );
        mThalSpinner.setAdapter(thalsAdapter);
    }
}
