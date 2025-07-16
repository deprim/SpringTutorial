package org.example;


import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {

    public ClassicalMusic() {

    }

    public static ClassicalMusic getInstance() {
        return new ClassicalMusic();
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }

    public void doMyInit(){
        System.out.println("Doing my Initialization");
    }

    public void doMyDestroy(){
        System.out.println("Doing my Destroy");
    }
}
