package com.mavixk.repository;

import com.mavixk.model.Speaker;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

  public List<Speaker> findAll() {
    List<Speaker> speakers = new ArrayList<Speaker>();
    Speaker speaker = new Speaker();
    speaker.setFirstname("pritesh");
    speaker.setLastname("kumar");
    speakers.add(speaker);
    return speakers;
  }
}
