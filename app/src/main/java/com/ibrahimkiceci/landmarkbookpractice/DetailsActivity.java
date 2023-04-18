package com.ibrahimkiceci.landmarkbookpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.ibrahimkiceci.landmarkbookpractice.databinding.ActivityDetailsBinding;

public class DetailsActivity extends AppCompatActivity {

    private ActivityDetailsBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        //Intent intent = getIntent();
        //LandMark selectedLandMark = (LandMark) intent.getSerializableExtra("landmark");

        Singleton singleton = Singleton.getInstance();
        LandMark selectedLandMark = singleton.getSelectedLandmark();

        binding.nameText.setText(selectedLandMark.name);
        binding.countryText.setText(selectedLandMark.country);
        binding.imageView.setImageResource(selectedLandMark.image);




    }
}