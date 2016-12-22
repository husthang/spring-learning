package com.liuhang.spring.di.soundsystem_xmlconfig;

/**
 * Created by liuhang on 16/10/12.
 */
public class BlankDisc implements CompacDisc {
    private String title;
    private String author;

    public BlankDisc(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void play() {
        System.out.print("Playing " + title + " by " + author);
    }
}
