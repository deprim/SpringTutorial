package org.example;


import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RockMusic implements Music {

    @Override
    public List<String> getSong() {
        return List.of("Bleach", "Everlong", "Fuel");
    }

}
