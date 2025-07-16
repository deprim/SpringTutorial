package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
//
//  private List<Music> musicList = new ArrayList<>();
    private Music music1;
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }
//    private String name;
//    private int volume;



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

    public String playMusic(MusicEnum musicEnum) {
        Random random = new Random();
        int musicSize1 = music1.getSong().size();
        int musicSize2 = music2.getSong().size();
        if (musicEnum == MusicEnum.CLASSICAL){
            return music1.getSong().get(random.nextInt(musicSize1));
        }
        else {
            return music2.getSong().get(random.nextInt(musicSize2));
        }

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
