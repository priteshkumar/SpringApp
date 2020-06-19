package com.mavixk;

import com.mavixk.util.CalendarFactory;
import java.util.Calendar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

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

  @Bean(name = "cal")
  public CalendarFactory calFactory() {
    CalendarFactory calendarFactory = new CalendarFactory();
    calendarFactory.addDays(2);
    return calendarFactory;
  }

  @Bean
  public Calendar cal() throws Exception {
    return calFactory().getObject();
  }
}
