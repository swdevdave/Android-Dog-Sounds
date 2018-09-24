package com.swdave.dogsounds.myapplication;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomSoundAdapter extends BaseAdapter {


    private Context mContext;
    private int mLayout;
    private ArrayList<Sound> mSoundList;
    private MediaPlayer mMediaPlayer;


    CustomSoundAdapter(Context mContext, int mLayout, ArrayList<Sound> mSoundList) {
        this.mContext = mContext;
        this.mLayout = mLayout;
        this.mSoundList = mSoundList;
    }

    @Override
    public int getCount() {
        return mSoundList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    private class ViewHolder{
        TextView sound_text_view;
        ImageView playIcon;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final ViewHolder viewHolder;
        if (convertView == null){
            viewHolder = new ViewHolder();
            LayoutInflater layoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            assert layoutInflater != null;
            convertView = layoutInflater.inflate(mLayout,null);
            viewHolder.sound_text_view = convertView.findViewById(R.id.sound_text_view);
            viewHolder.playIcon = convertView.findViewById(R.id.play_icon);

            convertView.setTag(viewHolder);

        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        final Sound sound = mSoundList.get(position);
        viewHolder.sound_text_view.setText(sound.getSoundName());


        //play music
        viewHolder.playIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                mMediaPlayer = MediaPlayer.create(mContext, sound.getSoundId());
                mMediaPlayer.start();

            }
        });

        return convertView;
    }

    private void stopPlaying(){
        if (mMediaPlayer != null){
            mMediaPlayer.stop();
            mMediaPlayer.release();
            mMediaPlayer = null;
        }
    }


}
