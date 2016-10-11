package com.liuhang.springinaction.soundsystem;

import org.springframework.stereotype.Component;

/**
 * Created by liuhang on 16/10/10.
 */
@Component
public class SgtPeppers  implements CompacDisc{
    private String title="Sgt。 Pepper's Lonely Hearts Clue Band";
    private String artist="The Beatles";
    public void play(){
        System.out.println("Playing"+title+"by"+artist);
    }

}
