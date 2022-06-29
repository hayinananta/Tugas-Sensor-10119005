package com.example.a10119005_sensor.ui.about;

import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.a10119005_sensor.R;

import androidx.viewpager2.widget.ViewPager2;


import java.util.ArrayList;
import java.util.List;

//NIM : 10119005
//Nama : Hayin Ananta
//Kelas : IF-1

public class AboutFragment extends Fragment {

    ViewPager2 viewPager2;
    List<AboutItemModel> aboutList;

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {
// Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_about, container, false);

        viewPager2 = view.findViewById(R.id.viewpager);
        aboutList = new ArrayList<>();

        String[] judul = {"Version", "About", "Made by"};
        String[] desc = {"1.0", "Aplikasi ini dibuat untuk memenuhi Tugas Sensor", "Hayin Ananta"};

        for (int i=0; i < judul.length; i++){
            AboutItemModel item = new AboutItemModel(judul[i], desc[i]);
            aboutList.add(item);
        }

        ViewPagerAboutAdapter adapter = new ViewPagerAboutAdapter(aboutList);

        viewPager2.setAdapter(adapter);
        viewPager2.setClipToPadding(false);
        viewPager2.setClipChildren(false);
        viewPager2.setOffscreenPageLimit(2);
        viewPager2.getChildAt(0).setOverScrollMode(View.OVER_SCROLL_NEVER);


        return view;
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
//        binding = null;
    }
}