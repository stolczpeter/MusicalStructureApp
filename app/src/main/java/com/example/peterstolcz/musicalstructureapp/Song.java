package com.example.peterstolcz.musicalstructureapp;

public class Song {

    private String mSongrecord;

    private String mArtistrecord;

    private Integer mSongimage;

    private Integer mSongimagebutton;

    public Song(String SongName, String ArtistName, Integer Songimage, Integer Songimagebutton) {
        mSongrecord = SongName;
        mArtistrecord = ArtistName;
        mSongimage = Songimage;
        mSongimagebutton = Songimagebutton;
    }

    public String getSongName() {
        return mSongrecord;
    }

    public String getArtistName() {
        return mArtistrecord;
    }

    public Integer getSongimage() {
        return mSongimage;

    }

    public Integer getSongimagebutton() {
        return mSongimagebutton;
    }

}