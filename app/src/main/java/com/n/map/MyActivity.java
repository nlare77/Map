package com.n.map;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;


public class MyActivity extends Activity {
    private GoogleMap mMap;
    static final LatLng PERTH = new LatLng(-31.90, 115.86);
    static final LatLng LOU = new LatLng(38.25, -85.77);
    static final LatLng NY = new LatLng(40.71, -74.00);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_my);
      /*  if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        } */


        mMap = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();



        Marker perth = mMap.addMarker(new MarkerOptions()
                .position(PERTH)
                .title("Perth, Australia")
                .draggable(true));

        Marker lou = mMap.addMarker(new MarkerOptions()
        .position(LOU)
                .title("Louisville, KY")
        .draggable(true));

        Marker ny = mMap.addMarker(new MarkerOptions()
        .position(NY)
        .title("New York City, NY")
        .draggable(true));

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_my, container, false);
            return rootView;
        }
    }
}
