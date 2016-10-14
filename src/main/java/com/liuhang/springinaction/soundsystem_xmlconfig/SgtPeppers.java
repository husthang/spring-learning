package com.liuhang.springinaction.soundsystem_xmlconfig;

/**
 * Created by liuhang on 16/10/11.
 */
public class SgtPeppers implements CompacDisc {
    String title = "Sgt. Pepper's Lonely Hearts Club Band";
    String author = "The Beatles";

    public void play() {
        System.out.print("Playing " + title + " by " + author);
    }
}
