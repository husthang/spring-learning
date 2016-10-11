package com.liuhang.springinaction.soundsystem;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by liuhang on 16/10/10.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CdPlayerConfig.class)
public class CdPlayerTest {
    @Autowired
    private CompacDisc cd;
    @Test
    public void cdShouldNotBeNull(){
        assertNotNull(cd);
    }
}
