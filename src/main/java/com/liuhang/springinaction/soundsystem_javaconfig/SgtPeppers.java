package com.liuhang.springinaction.soundsystem_javaconfig;

import org.junit.contrib.java.lang.system.SystemOutRule;

/**
 * Created by liuhang on 16/10/11.
 */
public class SgtPeppers implements CompacDisc {
    String title = "Sgt. Pepper's Lonely Hearts Clue Band";
    String author = "The Beatles";

    public void play() {
        System.out.print("Playing " + title + " by " + author);
    }
}
