package com.liuhang.springinaction.soundsystem_xmlconfig;

/**
 * Created by liuhang on 16/10/11.
 */
public class CdPlayer implements MediaPlayer {
    private CompacDisc cd;

    public CdPlayer(CompacDisc cd) {
        this.cd = cd;
    }

    public void play() {
        cd.play();
    }
}
