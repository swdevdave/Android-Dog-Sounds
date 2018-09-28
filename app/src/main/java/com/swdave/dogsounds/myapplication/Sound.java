package com.swdave.dogsounds.myapplication;

class Sound {


    private final String soundName;
    private int soundId;


    Sound(String soundName, int soundId) {
        this.soundName = soundName;
        this.soundId = soundId;

    }

    String getSoundName() {
        return soundName;
    }

    int getSoundId() {
        return soundId;
    }

}
