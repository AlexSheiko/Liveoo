package com.liveoo.adapters;

import android.app.Activity;
import android.view.View;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;
import com.liveooapp.liveoo.R;

public class InfoWindowAdapter implements GoogleMap.InfoWindowAdapter {

    private Activity mActivity;

    public InfoWindowAdapter(Activity activity) {
        mActivity = activity;
    }

    @Override
    public View getInfoWindow(Marker marker) {
        View v = mActivity.getLayoutInflater().inflate(R.layout.info_window, null);

        return v;
    }

    @Override
    public View getInfoContents(Marker marker) {
        return null;
    }
}
