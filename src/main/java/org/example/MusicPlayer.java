package org.example;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {

    private List<Music> musicList = new ArrayList<>();
    private String name;
    private int volume;

    // IoC - Ivension of Control


    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public MusicPlayer(){

    }

    public void playMusic() {
        for (Music music : musicList){
            String song = music.getSong();
            System.out.println("PLaying: " + song);
        }

    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
