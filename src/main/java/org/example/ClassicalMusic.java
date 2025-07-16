package org.example;


import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClassicalMusic implements Music {

    public ClassicalMusic() {

    }

    public static ClassicalMusic getInstance() {
        return new ClassicalMusic();
    }

    @Override
    public List<String> getSong() {
        return List.of("Hungarian Raphsody", "7th Symphony", "Times of year");
    }

    public void doMyInit(){
        System.out.println("Doing my Initialization");
    }

    public void doMyDestroy(){
        System.out.println("Doing my Destroy");
    }
}
