package com.severianfw.training_mobile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.severianfw.training_mobile.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mBinding;

    private List<String> nbaTeamsItemName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(mBinding.getRoot());

        nbaTeamsItemName = new ArrayList<>();

        nbaTeamsItemName.add("Boston Celtics");
        nbaTeamsItemName.add("Chicago Bulls");
        nbaTeamsItemName.add("Atlanta Hawks");

        mBinding.rvNbaTeam.setLayoutManager(new LinearLayoutManager(this));
        mBinding.rvNbaTeam.setAdapter(new NbaTeamAdapter(nbaTeamsItemName));
    }
}