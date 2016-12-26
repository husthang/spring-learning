package stereo.xmlconfig;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import stereo.entity.MediaPlayer;

/**
 * Created by liuhang on 2016/12/26.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:ConstructorArgReferTest-context.xml")
public class ConstructorArgReferTest {
    @Autowired
    private MediaPlayer mediaPlayer;
    @Test
    public void play(){
        mediaPlayer.play();
    }
}
