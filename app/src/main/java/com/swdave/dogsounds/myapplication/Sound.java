package com.swdave.dogsounds.myapplication;

public class Sound {


    private String soundName;
    private int soundId;


    Sound(String soundName, int soundId) {
        this.soundName = soundName;
        this.soundId = soundId;

    }

    public String getSoundName() {
        return soundName;
    }

    public void setSoundName(String soundName) {
        this.soundName = soundName;
    }

    public int getSoundId() {
        return soundId;
    }

    public void setSoundId(int soundId) {
        this.soundId = soundId;
    }
}
