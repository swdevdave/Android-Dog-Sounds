package com.swdave.dogsounds.myapplication;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SeekBar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Sound> mSoundArray;
    private CustomSoundAdapter mAdapter;
    private ListView mSoundListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSoundListView = findViewById(R.id.sounds_list);
        mSoundArray = new ArrayList<>();
        mSoundArray.add(new Sound("Labrador Barking", R.raw.lab_bark));
        mSoundArray.add(new Sound("Doberman Barking", R.raw.doberman_bark));
        mSoundArray.add(new Sound("Chihuahua Barking ", R.raw.chih_barking));
        mSoundArray.add(new Sound("Puppy Barking", R.raw.puppy_barking));
        mSoundArray.add(new Sound("Puppy Barking", R.raw.puppy_barking));
        mSoundArray.add(new Sound("Puppy Barking", R.raw.puppy_barking));
        mSoundArray.add(new Sound("Puppy Barking", R.raw.puppy_barking));
        mSoundArray.add(new Sound("Puppy Barking", R.raw.puppy_barking));
        mSoundArray.add(new Sound("Puppy Barking", R.raw.puppy_barking));
        mSoundArray.add(new Sound("Puppy Barking", R.raw.puppy_barking));
        mSoundArray.add(new Sound("Puppy Barking", R.raw.puppy_barking));



        mAdapter = new CustomSoundAdapter(this, R.layout.list_sounds, mSoundArray);
        mSoundListView.setAdapter(mAdapter);


    }
}

