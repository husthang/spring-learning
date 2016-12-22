package com.liuhang.spring.di.soundsystem_javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by liuhang on 16/10/11.
 */
@Configuration
public class CdPlayerConfig {
    @Bean
    public CompacDisc compacDisc() {
        return new SgtPeppers();
    }

    @Bean
    public CdPlayer cdPlayer(CompacDisc cd) {
        return new CdPlayer(cd);
    }
}
