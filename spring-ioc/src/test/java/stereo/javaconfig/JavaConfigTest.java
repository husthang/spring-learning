package stereo.javaconfig;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import stereo.entity.MediaPlayer;

/**
 * Created by liuhang on 2016/12/25.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Config.class)
public class JavaConfigTest {

    @Autowired
    private MediaPlayer player;

    @Test
    public void notNull() {
        Assert.assertNotNull(player);
    }

    @Test
    public void play(){
        player.play();
    }

}
