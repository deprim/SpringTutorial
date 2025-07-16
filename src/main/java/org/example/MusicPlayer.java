package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
//
//  private List<Music> musicList = new ArrayList<>();


    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
//    private String name;
//    private int volume;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    // IoC - Ivension of Control


//    public MusicPlayer(Music music) {
//        this.music = music;
//    }

//    public MusicPlayer(List<Music> musicList) {
//        this.musicList = musicList;
//    }



//    public void playMusicList() {
//        for (Music music : musicList){
//            String song = music.getSong();
//            System.out.println("Playing: " + song);
//        }
//
//    }

    public String playMusic() {
        return "Playing : " + classicalMusic.getSong();

    }
//
//    public void setMusicList(List<Music> musicList) {
//        this.musicList = musicList;
//    }


//    @Autowired
//    public void setMusic(Music music) {
//        this.music = music;
//    }


}
