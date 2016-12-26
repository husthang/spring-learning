package stereo.xmlconfig;

import stereo.entity.Media;
import stereo.entity.MediaPlayer;

/**
 * Created by liuhang on 2016/12/26.
 */
public class Mp3Player implements MediaPlayer {
    private Media media;

    @Override
    public void play() {
        media.play();
    }

    public void setMedia(Media media) {
        this.media = media;
    }
}
