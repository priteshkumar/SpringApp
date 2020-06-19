package com.mavixk.repository;

import com.mavixk.model.Speaker;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

  private Calendar calendar;

  //spel example
  @Value("#{T(java.lang.Math).random() * 100}")
  private double seedNum;

  @Autowired
  public HibernateSpeakerRepositoryImpl(Calendar calendar) {
    this.calendar = calendar;
  }

  public List<Speaker> findAll() {
    List<Speaker> speakers = new ArrayList<Speaker>();
    Speaker speaker = new Speaker();
    speaker.setFirstname("pritesh");
    speaker.setLastname("kumar");
    speaker.setSeednum(this.seedNum);
    speakers.add(speaker);
    System.out.println(this.calendar.getTime());
    return speakers;
  }
}
