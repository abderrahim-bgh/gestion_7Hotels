package com.example.gestion_hotel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rc;
    List<String> str;
    List<Integer> image,scal;
    adapter_h adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rc = findViewById(R.id.hotels);
        str= new ArrayList<>();
        image= new ArrayList<>();
        scal= new ArrayList<>();
        str.add("Hotel: Royal Hotel Oran");
        str.add("hotel: Four Points by Sheraton");
        str.add("hotel: Holiday Inn Algiers ");
        str.add("hotel: The Legacy Luxury Hotel");
        str.add("hotel: AZ Hôtels Kouba");
        str.add("hotel: Assala Hotel");
        str.add("hotel: Lamaraz Hotels");
        image.add(R.drawable.royal);
        image.add(R.drawable.four);
        image.add(R.drawable.holy);
        image.add(R.drawable.ibis);
        image.add(R.drawable.royal);
        image.add(R.drawable.hotel_1);
        image.add(R.drawable.hotel_2);
        scal.add(R.drawable.scale5);
        scal.add(R.drawable.scale5);
        scal.add(R.drawable.scal4);
        scal.add(R.drawable.scal4);
        scal.add(R.drawable.scal3);
        scal.add(R.drawable.scal3);
        scal.add(R.drawable.scal2);

            adapter= new adapter_h(this, str,image,scal);
        GridLayoutManager gridLayoutManager= new GridLayoutManager(this,1,GridLayoutManager.VERTICAL,false);
        rc.setLayoutManager(gridLayoutManager);
        rc.setAdapter(adapter);
    }
}