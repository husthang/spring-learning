package com.liuhang.spring.di.soundsystem_autoconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by liuhang on 16/10/11.
 */
@Component
public class CdPlayer implements MediaPlayer {
    private CompacDisc cd;

    @Autowired
    public CdPlayer(CompacDisc cd) {
        this.cd = cd;
    }

    public void play() {
        cd.play();
    }

    @Autowired
    public void setCd(CompacDisc cd) {
        this.cd = cd;
    }
}
