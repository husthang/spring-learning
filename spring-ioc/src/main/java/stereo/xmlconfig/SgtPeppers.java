package stereo.xmlconfig;

import stereo.entity.Media;

/**
 * Created by liuhang on 2016/12/23.
 * 实现CD接口,具体的CD: SgtPeppers
 */
public class SgtPeppers implements Media {

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("Playing " + title + "by " + artist);
    }
}
