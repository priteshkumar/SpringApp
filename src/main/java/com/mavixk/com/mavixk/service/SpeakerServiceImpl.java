package com.mavixk.com.mavixk.service;

import com.mavixk.model.Speaker;
import com.mavixk.repository.SpeakerRepository;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService {

  private SpeakerRepository speakerRepository;

  public SpeakerServiceImpl() {
    System.out.println("inside " + this.getClass().getSimpleName() + " constructor");
  }

  //@Autowired : constructor injection
  public SpeakerServiceImpl(SpeakerRepository speakerRepository) {
    this.speakerRepository = speakerRepository;
  }

  //init method hook of bean lifecycle
  //called after constructor/setter injection is done
  @PostConstruct
  private void initialize() {
    System.out.println("initialize " + this.getClass().getSimpleName()  +". Called after "
        + "constructor");
  }

  //setter injection by spring ioc
  @Autowired
  public void setSpeakerRepository(SpeakerRepository speakerRepository) {
    System.out.println("inside setter method");
    this.speakerRepository = speakerRepository;
  }

  public List<Speaker> findAll() {
    return speakerRepository.findAll();
  }
}
