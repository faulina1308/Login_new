package com.faulinaindri202102297.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {
    private Button _tampilTabButton,_tampilMahasiswaButton, _tampilForexButton, _tampilCuacaButton, _tampilHotelButton, _tampilImplicitButton;
    private Intent _tampilTabIntent,_tampilMahasiswaIntent, _tampilForexIntent, _tampilCuacaIntent, _tampilHotelIntent,_tampilImplicitIntent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        String username = getIntent().getStringExtra("Username");
        getSupportActionBar().setTitle(username);
        
        initTampilMahasiswaButton();
        initTampilForexButton();
        initTampilCuacaBotton();
        initTampilHotelBotton();
        initTampilImplicitBotton();
        initTampilTabBotton();
    }

    private void initTampilTabBotton() {
        _tampilTabButton = findViewById(R.id.tampilTabLayout);
        _tampilTabButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _tampilTabIntent = new Intent(getApplicationContext(), TabLayoutActivity.class);
                startActivity(_tampilTabIntent);
            }
        });
    }
    private void initTampilCuacaBotton() {
        _tampilCuacaButton = findViewById(R.id.tampilCuacaButton);
        _tampilCuacaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _tampilCuacaIntent = new Intent(getApplicationContext(), CuacaMainActivity.class);
                startActivity(_tampilCuacaIntent);
            }
        });
    }
    private void initTampilHotelBotton() {
        _tampilHotelButton = findViewById(R.id.tampilHotel);
        _tampilHotelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _tampilHotelIntent = new Intent(getApplicationContext(), HotelActivity.class);
                startActivity(_tampilHotelIntent);
            }
        });
    }

    private void initTampilImplicitBotton() {
        _tampilImplicitButton = findViewById(R.id.tampilIntent);
        _tampilImplicitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _tampilImplicitIntent = new Intent(getApplicationContext(), ImplicitActivity.class);
                startActivity(_tampilImplicitIntent);
            }
        });
    }

    private void initTampilMahasiswaButton() {
        _tampilMahasiswaButton = (Button) findViewById(R.id.tampilMahasiswaButton);

        _tampilMahasiswaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _tampilMahasiswaIntent = new Intent(getApplicationContext(), TampilMahasiswaActivity.class);
                startActivity(_tampilMahasiswaIntent);
            }
        });
    }

    private void initTampilForexButton() {
        _tampilForexButton = (Button) findViewById(R.id.tampilForexButton);

        _tampilForexButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                _tampilForexIntent = new Intent(getApplicationContext(), ForexMainActivity.class);
                startActivity(_tampilForexIntent);
            }
        });
    }
}