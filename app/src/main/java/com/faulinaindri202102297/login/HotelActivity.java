package com.faulinaindri202102297.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class HotelActivity extends AppCompatActivity {
    private ImageView _imageView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);

        _imageView1 = findViewById(R.id.imageviewHotel);

        String imageUrl ="https://shopee.co.id/inspirasi-shopee/wp-content/uploads/2022/05/hotel-dekat-pantai-jogja.webp";
        Picasso.with(this).load(imageUrl).into(_imageView1);
    }
}