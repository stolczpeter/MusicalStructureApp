package com.example.peterstolcz.musicalstructureapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

    private static final String LOG_TAG = SongAdapter.class.getSimpleName();

    public SongAdapter(Activity context, ArrayList<Song> songArrayList) {
        super(context, 0, songArrayList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.songlist, parent, false);
        }

        Song base = getItem(position);

        TextView songTextView = (TextView) listItemView.findViewById(R.id.songname);
        songTextView.setText(base.getSongName());

        TextView artistTextView = (TextView) listItemView.findViewById(R.id.artistname);
        artistTextView.setText(base.getArtistName());

        ImageView songimageView = (ImageView) listItemView.findViewById(R.id.imagename);
        songimageView.setImageResource(base.getSongimage());

        ImageView songimageButtonView = (ImageView) listItemView.findViewById(R.id.imageplayname);
        songimageButtonView.setImageResource(base.getSongimagebutton());

        return listItemView;
    }
}
