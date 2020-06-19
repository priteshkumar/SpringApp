package com.mavixk;

import com.mavixk.com.mavixk.service.SpeakerService;
import com.mavixk.com.mavixk.service.SpeakerServiceImpl;
import com.mavixk.repository.HibernateSpeakerRepositoryImpl;
import com.mavixk.repository.SpeakerRepository;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan({"com.mavixk"})
public class SpringAppConfig {
/*
  @Bean(name = "speakerService")
  @Scope(value= BeanDefinition.SCOPE_SINGLETON)
  public SpeakerService getSpeakerService() {
    SpeakerServiceImpl speakerService = new SpeakerServiceImpl();
    speakerService.setSpeakerRepository(getSpeakerRepository());
    return speakerService;
  }

  @Bean(name = "speakerRepository")
  public SpeakerRepository getSpeakerRepository() {
    return new HibernateSpeakerRepositoryImpl();
  }
  */
}
