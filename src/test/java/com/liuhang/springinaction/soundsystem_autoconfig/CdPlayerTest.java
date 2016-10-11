package com.liuhang.springinaction.soundsystem;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
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
    /**
     * Rule注解，Junit规则 SystemOUtRule 代替StandarOutputStreamLog(不被推荐)
     */
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
        /**
         * player对象，没有用new object()来创建对象，使用spring之后，创建对象由spring完成，创建对象的主动权和
         * 时机掌握在spring手里，即所谓控制反转IoC(Inversion of Control);
         * 用interface去实现逻辑，修改代码时，修改实现接口的具体class即可，有利于代码重构
         */
        player.play();
        assertEquals("Playing Sgt. Pepper's Lonely Hearts Clue Band by The Beatles", systemOutRule.getLog());
    }
}
