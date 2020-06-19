package com.mavixk;

import com.mavixk.com.mavixk.service.SpeakerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringTestApp {

  public static void main(String[] args) {
    //SpeakerService speakerService = new SpeakerServiceImpl();
    ApplicationContext appContext = new AnnotationConfigApplicationContext(SpringAppConfig.class);
    SpeakerService speakerService = appContext.getBean("speakerService", SpeakerService.class);
    System.out.println(speakerService);
    System.out.println(speakerService.findAll().get(0).getFirstname());
    SpeakerService speakerService2 = appContext.getBean("speakerService", SpeakerService.class);
    System.out.println(speakerService2);

  }
}
