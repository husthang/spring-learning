package stereo.javaconfig;

import stereo.entity.CompactDisc;
import stereo.entity.MediaPlayer;

/**
 * Created by liuhang on 2016/12/23.
 * 具体的播放器-Cd播放器,实现播放器接口
 */
public class CDPlayer implements MediaPlayer {
    private CompactDisc compactDisc;

    public CDPlayer(CompactDisc compactDisc) {
        this.compactDisc = compactDisc;
    }

    @Override
    public void play() {
        compactDisc.play();
    }
}
