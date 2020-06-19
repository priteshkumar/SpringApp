package com.mavixk;

import com.mavixk.com.mavixk.service.SpeakerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringTestApp {

  public static void main(String[] args) {
    //SpeakerService speakerService = new SpeakerServiceImpl();
    ApplicationContext appContext = new AnnotationConfigApplicationContext(SpringAppConfig.class);
    System.out.println("################################");
    System.out.println("logging registered bean definitions inside IOC");
    for (String beanDef : appContext.getBeanDefinitionNames()) {
      System.out.println(beanDef);
    }
    System.out.println("################################");

    SpeakerService speakerService = appContext.getBean("speakerService", SpeakerService.class);
    //System.out.println(speakerService);
    System.out.println(speakerService.findAll().get(0).getFirstname());
    SpeakerService speakerService2 = appContext.getBean("speakerService", SpeakerService.class);
    System.out.println(speakerService2.findAll().get(0).getSeednum());

  }
}
