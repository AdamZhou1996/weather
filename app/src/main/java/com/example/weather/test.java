package com.example.weather;

import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.weather.db.Province;

import org.litepal.crud.DataSupport;

import java.util.List;

public class test extends AppCompatActivity {

    public void chaxun() {
        List<Province> provinces = DataSupport.findAll(Province.class);
        for (Province province:provinces)
        {
            Log.d("MainActivity", "id  is" + province.getId());
            Log.d("MainActivity", "name is" + province.getProvinceName());
        }
    }
}
