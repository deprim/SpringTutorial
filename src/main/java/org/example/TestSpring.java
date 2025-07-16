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

//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class); // Spring will create
                                                                                            // dependency and injection by himself
//        musicPlayer.playMusic();


//       Lesson 9. Anotation @Component
//        Music classicalMusic = context.getBean("classicalMusic", Music.class);
//        MusicPlayer musicPlayer = new  MusicPlayer(classicalMusic);
//        musicPlayer.playMusic();
//
//        Music rockMusic = context.getBean("rockMusic", Music.class);
//        MusicPlayer musicPlayer2 = new  MusicPlayer(rockMusic);
//        musicPlayer2.playMusic();
//
//        Music rapMusic = context.getBean("rapMusic", Music.class);
//        MusicPlayer musicPLayer3 = new  MusicPlayer(rapMusic);
//        musicPLayer3.playMusic();

//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();



//        NESTED DEPENDENCY

//        In plain Java code
//        ClassicalMusic music = new ClassicalMusic();
//        RockMusic music1 = new RockMusic();

//                      ↑
//                  depends on
//                      ↑
//
//        MusicPlayer musicPlayer = new MusicPlayer(music, music1);
//
//                      ↑
//                  depends on
//                      ↑
//
//        Computer computer = new Computer(musicPlayer);
//
//        System.out.println(computer);
//
//

//        With Spring:
        Computer computer1 = context.getBean("computer", Computer.class);
        System.out.println(computer1);


//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());

        context.close();
//
//        List<Music> musicList = List.of(new RapMusic(), new ClassicalMusic(), new RockMusic());
//        MusicPlayer musicPlayer2 = new MusicPlayer(musicList);
//        musicPlayer2.playMusic();



    }
}
