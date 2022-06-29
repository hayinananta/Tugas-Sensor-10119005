package com.example.a10119005_sensor.ui.restoran;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.a10119005_sensor.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

//NIM : 10119005
//Nama : Hayin Ananta
//Kelas : IF-1

public class RestoranFragment extends Fragment implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_restoran, container, false);
        SupportMapFragment mMapFragment = (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.restoran);
        mMapFragment.getMapAsync(this);
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        mMap = googleMap;

        LatLng warkop99 = new LatLng(-6.8849368647207525, 107.61530566933942);
        LatLng buonah = new LatLng(-6.8873261502003755, 107.61875039731481);
        LatLng babehKurnia = new LatLng(-6.887576803068492, 107.61536153540854);
        LatLng wongeDewe = new LatLng(-6.887095930415071, 107.61717098745487);
        LatLng Adany = new LatLng(-6.8882870164095875, 107.6165918490459);

        mMap.addMarker(new MarkerOptions().position(warkop99).title("Warkop 99"));
        mMap.addMarker(new MarkerOptions().position(buonah).title("Nasi Kuning Bu Onah"));
        mMap.addMarker(new MarkerOptions().position(babehKurnia).title("Warung Babeh Kurnia"));
        mMap.addMarker(new MarkerOptions().position(wongeDewe).title("Mie Ayam Wonge Dewe"));
        mMap.addMarker(new MarkerOptions().position(Adany).title("Warkop 99 A Dany"));

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(warkop99, 15));
    }
}