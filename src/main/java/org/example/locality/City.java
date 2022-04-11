package org.example.locality;

import lombok.AllArgsConstructor;
import lombok.ToString;
import org.example.system.Electricity;
import org.example.system.Pipeline;
import org.example.system.WaterPipes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@AllArgsConstructor
@ToString
@Component
public class City {

  @Autowired
  @Qualifier("nameEl")
  private final Electricity electricity;

  private final WaterPipes waterPipes;
  private final Pipeline pipeline;

  @PostConstruct
  public void ready() {
    System.out.println("Город готов!");
  }

}
