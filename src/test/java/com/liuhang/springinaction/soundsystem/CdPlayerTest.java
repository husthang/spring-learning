package com.liuhang.springinaction.soundsystem;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
//import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by liuhang on 16/10/10.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CdPlayerConfig.class)
public class CdPlayerTest {
    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
    @Autowired
    private CompacDisc cd;
    @Autowired
    private MediaPlayer player;

    @Test
    public void cdShouldNotBeNull() {
        assertNotNull(cd);
    }

    @Test
    public void play() {
        player.play();
        assertEquals("Playing Sgt. Pepper's Lonely Hearts Clue Band by The Beatles", systemOutRule.getLog());
    }
}
