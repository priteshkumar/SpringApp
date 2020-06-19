package com.mavixk.repository;

import com.mavixk.model.Speaker;
import java.util.List;

public interface SpeakerRepository {

  List<Speaker> findAll();
}
