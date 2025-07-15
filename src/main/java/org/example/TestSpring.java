package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestSpring {

    public static void main(String[] args) {

        // path to our applicationContext.xml file, it MUST be in resoruces folder and marked as resources folder
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");


        //        This is code WITHOUT IoC and Dependency Injection
        //        Music music = new RapMusic();  // create dependency by meself (manually)
        //        MusicPlayer musicPlayer1 = new MusicPlayer(music); // inject dependency manually
        //        musicPlayer1.playMusic();

        // MANUAL DEPENDENCY INJECTION
        // pass to the method bean id from applicationContext.xml and Music.class
        // Music music = context.getBean("musicBean", Music.class);
        // MusicPlayer musicPlayer = new MusicPlayer(music);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class); // Spring will create
                                                                                            // dependency and injection by himself
        musicPlayer.playMusic();

//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());

        context.close();
//
//        List<Music> musicList = List.of(new RapMusic(), new ClassicalMusic(), new RockMusic());
//        MusicPlayer musicPlayer2 = new MusicPlayer(musicList);
//        musicPlayer2.playMusic();



    }
}
