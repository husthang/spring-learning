package stereo.autoconfig;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import stereo.entity.CompactDisc;
import stereo.entity.MediaPlayer;

/**
 * Created by liuhang on 2016/12/23.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Config.class)
public class AutoConfigTest {
    @Autowired
    private CompactDisc compactDisc;

    @Autowired
    private MediaPlayer mediaPlayer;

    @Test
    public void cdShouldNotBeNull() {
        Assert.assertNotNull(compactDisc);
    }

    @Test
    public void mediaPlayerShouldNotBeNull(){
        Assert.assertNotNull(mediaPlayer);
    }
}
