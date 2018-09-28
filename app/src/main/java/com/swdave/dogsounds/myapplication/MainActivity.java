package com.swdave.dogsounds.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AdView adView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();

        adView.loadAd(adRequest);

        // Sample AdMob app ID: ca-app-pub-3940256099942544~3347511713
        //TODO: UPDATE TO PROPER APP ID
        MobileAds.initialize(this, "ca-app-pub-3940256099942544~3347511713");

        ListView mSoundListView = findViewById(R.id.sounds_list);
        ArrayList<Sound> mSoundArray = new ArrayList<>();

        mSoundArray.add(new Sound("Akita Puppy Barking", R.raw.akita_puppy_barking));
        mSoundArray.add(new Sound("Akita Puppy Yelp", R.raw.akita_puppy_yelp));
        mSoundArray.add(new Sound("Australian Shepherd Howl to Squeaker", R.raw.australian_shepherd_howl));
        mSoundArray.add(new Sound("Basset Hound Howling", R.raw.basset_hound_howling));
        mSoundArray.add(new Sound("BloodHound Howling Outside", R.raw.bloodhound_howl_outside));
        mSoundArray.add(new Sound("Boxer Intense Barking", R.raw.boxer_intense_barking));
        mSoundArray.add(new Sound("Chihuahua Barking 1", R.raw.chih_barking));
        mSoundArray.add(new Sound("Chihuahua Barking 2", R.raw.chi_barking));
        mSoundArray.add(new Sound("Cocker Spaniel Barking", R.raw.cocker_spaniel_bark));
        mSoundArray.add(new Sound("Doberman Barking", R.raw.doberman_bark));
        mSoundArray.add(new Sound("Doberman Barking Distant", R.raw.doberman_barking_distant));
        mSoundArray.add(new Sound("Dog Barking Distant Outside", R.raw.dog_barking_distance_outside));
        mSoundArray.add(new Sound("Dog Howl chorus Long", R.raw.dog_howl_chorus_xlong));
        mSoundArray.add(new Sound("Dog Whining", R.raw.dog_whining));
        mSoundArray.add(new Sound("Dogs Barking Indoors", R.raw.dogs_barking_indoors));
        mSoundArray.add(new Sound("Dogs Barking Outside 1", R.raw.dogs_barking_outdoors));
        mSoundArray.add(new Sound("Dogs Barking Outside 2", R.raw.dogs_barking_outdoors2));
        mSoundArray.add(new Sound("Dogs Barking Outside 3", R.raw.dogs_barking_outdoors3));
        mSoundArray.add(new Sound("Doorbell Sound 1", R.raw.doorbell1));
        mSoundArray.add(new Sound("Doorbell Sound 2", R.raw.doorbell2));
        mSoundArray.add(new Sound("Doorbell Sound 3", R.raw.doorbell3));
        mSoundArray.add(new Sound("German Sheppard Barking", R.raw.german_shepherd_barking));
        mSoundArray.add(new Sound("German Sheppard Whining 1", R.raw.german_shepherd_whining));
        mSoundArray.add(new Sound("German Sheppard Whining 2", R.raw.german_shepherd_whining2));
        mSoundArray.add(new Sound("German Sheppard Whining 3", R.raw.german_shepherd_whining3));
        mSoundArray.add(new Sound("Golden Retriever Barking Outside", R.raw.golden_retriever_barking_outside));
        mSoundArray.add(new Sound("Husky Howling/Talking", R.raw.husky_howling_talking));
        mSoundArray.add(new Sound("Labrador Barking", R.raw.lab_bark));
        mSoundArray.add(new Sound("Large Dog Barking Indoors", R.raw.large_dog_barking_indoors));
        mSoundArray.add(new Sound("Neighborhood Dog Barking Outside Long", R.raw.neighboord_dogs_barking_outdoors_long));
        mSoundArray.add(new Sound("Puppy Barking", R.raw.puppy_barking));
        mSoundArray.add(new Sound("Pekingese Yapping", R.raw.pekingese_yapping));
        mSoundArray.add(new Sound("Pomeranian Barking", R.raw.pomeranian_barking));
        mSoundArray.add(new Sound("Rottweiler Barking", R.raw.puppy_barking));
        mSoundArray.add(new Sound("Sheep Dog Barking Outdoors", R.raw.sheep_dog_barking_outdoors));
        mSoundArray.add(new Sound("Small Dog Whining", R.raw.small_dog_whinning));
        mSoundArray.add(new Sound("Small Dogs Barking Together", R.raw.two_small_dogs_barking));
        mSoundArray.add(new Sound("Squeaky Toy 1", R.raw.squeeky_toy));
        mSoundArray.add(new Sound("Squeaky Toy 2", R.raw.squeaky_toy2));
        mSoundArray.add(new Sound("Squeaky Toy 3", R.raw.squeaky_toy3));
        mSoundArray.add(new Sound("Squeaky Toy 4", R.raw.squeaky_toy4));
        mSoundArray.add(new Sound("StafordShire Terrier Panting", R.raw.staffordshire_terrier_panting));
        mSoundArray.add(new Sound("StafordShire Terrier Panting Long", R.raw.staffordshire_terrier_panting_long));
        mSoundArray.add(new Sound("StafordShire Terrier Playing Rough 1", R.raw.staffordshire_terrier_rough_play));
        mSoundArray.add(new Sound("StafordShire Terrier Playing Rough 2", R.raw.staffordshire_terrier_rough_play2));
        mSoundArray.add(new Sound("StafordShire Terrier Playing Rough 3", R.raw.staffordshire_terrier_rough_play3));
        mSoundArray.add(new Sound("StafordShire Terrier Whimper", R.raw.staffordshire_terrier_whimper));
        mSoundArray.add(new Sound("Tiny Puppy Whine 1", R.raw.tiny_puppy_whine));
        mSoundArray.add(new Sound("Tiny Puppy Whine 2", R.raw.tiny_puppy_whine2));
        mSoundArray.add(new Sound("Tiny Puppy Whine 3", R.raw.tiny_puppy_whine3));
        mSoundArray.add(new Sound("Wolves Howling Outside", R.raw.wolves_howling_outside));
        mSoundArray.add(new Sound("Yellow Lab Puppy", R.raw.yellow_lab_puppy)); // # 52


        CustomSoundAdapter mAdapter = new CustomSoundAdapter(this, R.layout.list_sounds, mSoundArray);
        mSoundListView.setAdapter(mAdapter);

    }
}

