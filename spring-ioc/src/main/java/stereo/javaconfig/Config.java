package stereo.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import stereo.entity.CompactDisc;
import stereo.entity.MediaPlayer;

/**
 * Created by liuhang on 2016/12/25.
 */
@Configuration
public class Config {
    @Bean
    public CompactDisc getCompactDisc() {
        return new SgtPeppers();
    }

    @Bean
    public MediaPlayer getMediaPlayer(CompactDisc compactDisc) {
        return new CDPlayer(compactDisc);
    }
}
