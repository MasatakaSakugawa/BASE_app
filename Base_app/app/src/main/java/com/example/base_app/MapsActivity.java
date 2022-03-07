package com.example.base_app;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.base_app.databinding.ActivityMapsBinding;
import com.google.android.gms.tasks.OnSuccessListener;

import java.util.ArrayList;
import java.util.List;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;
import retrofit.http.GET;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback,LocationListener {

    LocationManager locationManager;
    private GoogleMap mMap;
    private ActivityMapsBinding binding;
    private FusedLocationProviderClient fusedLocationClient;

    List<String> NameList = new ArrayList<String>();
    List<Float> LatList = new ArrayList<Float>();
    List<Float> LngList = new ArrayList<Float>();
    Boolean flag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        if (ContextCompat.checkSelfPermission(this,
                Manifest.permission.ACCESS_FINE_LOCATION) !=
                PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this,
                    new String[]{Manifest.permission.ACCESS_FINE_LOCATION,},
                    1000);
        }
        else{
            locationStart();
        }

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint("http://webservice.recruit.co.jp/hotpepper/gourmet/v1")
                .build();
        HottoApi service = restAdapter.create(HottoApi.class);

        service.getHotto(new Callback<Pepper>() {
            @Override
            public void success(Pepper pepper, Response response) {
                for (Shop s : pepper.getResults().getShop()) {
                    //Log.d("debug",s.getName());
                    NameList.add(s.getName());
                    //Log.d ("debug", "Lat" + String.valueOf(s.getLat()));
                    //Log.d ("debug", "Lng" + String.valueOf(s.getLng()));
                    LatList.add(s.getLat());
                    LngList.add(s.getLng());
                    flag = true;
                }
                LatLng test = new LatLng(26.254, 127.7629);
                mMap.addMarker(new MarkerOptions().position(test).title("test"));
                Log.d("debug", String.valueOf(NameList));
            }

            @Override
            public void failure(RetrofitError error) {
                Log.d("debug","callback failed");
                Log.d("debug", String.valueOf(error.getCause()));
            }
        });


    }


    @SuppressLint("MissingPermission")
    private void locationStart(){
        Log.d("debug","locationStart()");

        locationManager =
                (LocationManager) getSystemService(LOCATION_SERVICE);
        locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER,
                1000, 50, this);
    }

    @Override
    @SuppressLint("MissingPermission")

    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        //Log.d("Main","debugtesttt");

        LatLng usrlocation = new LatLng(26.25345333, 127.76638333333334);
        mMap.addMarker(new MarkerOptions().position(usrlocation).title("現在地"));

//        LatLng test = new LatLng(26.254, 127.7629);
//        mMap.addMarker(new MarkerOptions().position(test).title("test"));

//        Log.d("debug", String.valueOf(NameList));
//        Log.d("debug", String.valueOf(LatList));
//        Log.d("debug", String.valueOf(LngList));

        mMap.moveCamera(CameraUpdateFactory.newLatLng(usrlocation));
        mMap.animateCamera(CameraUpdateFactory.zoomTo(16));

    }

    @Override
    public void onLocationChanged(Location location) {
        // 緯度の表示
        String str1 = "Latitude:"+location.getLatitude();
        //Log.d("Lat",str1);

        // 経度の表示
        String str2 = "Longtude:"+location.getLongitude();
        //Log.d("Long",str2);
    }


    }