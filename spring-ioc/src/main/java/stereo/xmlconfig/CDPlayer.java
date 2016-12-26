package stereo.xmlconfig;

import stereo.entity.Media;
import stereo.entity.MediaPlayer;

/**
 * Created by liuhang on 2016/12/23.
 * 具体的播放器-Cd播放器,实现播放器接口
 */
public class CDPlayer implements MediaPlayer {
    private Media media;

    public CDPlayer(Media media) {
        this.media = media;
    }

    @Override
    public void play() {
        media.play();
    }

    public void setMedia(Media media){
        this.media = media;
    }
}
