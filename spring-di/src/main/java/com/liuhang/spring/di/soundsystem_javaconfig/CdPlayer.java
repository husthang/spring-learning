package com.liuhang.spring.di.soundsystem_javaconfig;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by liuhang on 16/10/11.
 */
public class CdPlayer implements MediaPlayer {
    private CompacDisc cd;

    @Autowired
    public CdPlayer(CompacDisc cd) {
        this.cd = cd;
    }

    public void play() {
        cd.play();
    }
}
