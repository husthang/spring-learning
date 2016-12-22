package com.liuhang.spring.di.soundsystem_xmlconfig;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by liuhang on 16/10/12.
 */
@RunWith(SpringJUnit4ClassRunner.class)
/**
 * class path的基目录 / 表示基目录
 */
@ContextConfiguration(locations = "/ConstructorArgRefTest.xml")
public class ConstructorArgRefTest {
    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
    @Autowired
    public MediaPlayer player;

    @Test
    public void play() {
        player.play();
        assertEquals("Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles", systemOutRule.getLog());
    }
}
