package com.exampleone.s.musicalstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Word {
    private String MovieName;
    private String SongName;
    private int sImageResource;
    private int sAudioResource;
    private int sPlayResource;
    public Word(String movieName, String songName,int ImageResource,int audioResource,int PlayResource) {
        MovieName = movieName;
        SongName = songName;
        sImageResource=ImageResource;
        sAudioResource=audioResource;
        sPlayResource=PlayResource;
    }
    /**
     * Get the MovieName of the word.
     */
    public String getMovieName() {

        return MovieName;
    }
    /**
     * Get the SongName of the word.
     */    public String getSongName() {

        return SongName;
    }
    public int getsImageResource() {

        return sImageResource;
    }
    public int getsAudioResource() {

        return sAudioResource;
    }
    public int getsPlayResource() {

        return sPlayResource;
    }
}

