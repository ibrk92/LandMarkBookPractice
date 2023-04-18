package com.ibrahimkiceci.landmarkbookpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;

import com.ibrahimkiceci.landmarkbookpractice.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    ArrayList<LandMark>landMarkArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        landMarkArrayList =  new ArrayList<>();

        LandMark pisa = new LandMark("Pisa", "Italy", R.drawable.pisa);
        LandMark eiffel = new LandMark("Eiffel", "France", R.drawable.eiffel);
        LandMark colosseum = new LandMark("Colosseum", "Italy", R.drawable.colesseo);
        LandMark londonBridge = new LandMark("London Bridge", "UK", R.drawable.londonbridge);

        landMarkArrayList.add(pisa);
        landMarkArrayList.add(eiffel);
        landMarkArrayList.add(colosseum);
        landMarkArrayList.add(londonBridge);

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        LandMarkAdapter landMarkAdapter = new LandMarkAdapter(landMarkArrayList);
        binding.recyclerView.setAdapter(landMarkAdapter);

    }
}