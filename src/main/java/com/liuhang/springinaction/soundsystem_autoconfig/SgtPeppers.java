package com.liuhang.springinaction.soundsystem;

import org.springframework.stereotype.Component;

/**
 * Created by liuhang on 16/10/10.
 *gt. Pepper's Lonely Hearts Clue Band是披头士Beatles的一张著名专辑
 */
@Component
public class SgtPeppers implements CompacDisc {
    private String title = "Sgt. Pepper's Lonely Hearts Clue Band";
    private String artist = "The Beatles";

    public void play() {
        System.out.print("Playing " + title + " by " + artist);
    }

}
