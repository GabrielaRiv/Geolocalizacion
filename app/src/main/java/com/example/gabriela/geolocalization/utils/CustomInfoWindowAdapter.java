package com.example.gabriela.geolocalization.utils;

import android.content.Context;
import android.location.Location;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.example.gabriela.geolocalization.R;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;

public class CustomInfoWindowAdapter implements GoogleMap.InfoWindowAdapter {

    private View mWindow;
    private Context context;

    String latitude = "latitude";
    String longitude = "longitude";

    public CustomInfoWindowAdapter(Context context) {
        context = context;
        mWindow = LayoutInflater.from(context).inflate(R.layout.custom_info_window, null);
    }

    private void rendowWindowText(Marker marker, View view){
        TextView txvLat = view.findViewById(R.id.txvLat);
        TextView txvLng = view.findViewById(R.id.txvLng);

        txvLat.setText(latitude);
        txvLng.setText(longitude);

    }

    @Override
    public View getInfoWindow(Marker marker) {
        rendowWindowText(marker, mWindow);
        return mWindow;
    }

    @Override
    public View getInfoContents(Marker marker) {
        rendowWindowText(marker, mWindow);
        return mWindow;
    }

}
