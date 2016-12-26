package stereo.xmlconfig;

import stereo.entity.Media;

/**
 * Created by liuhang on 2016/12/26.
 */
public class mp3 implements Media {
    private String music = "Take me to your heart";
    @Override
    public void play() {
        System.out.println("Singing: "+music);
    }
}
