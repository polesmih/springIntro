package org.example.ways;

import org.example.locality.City;
import org.example.system.Electricity;
import org.example.system.Pipeline;
import org.example.system.WaterPipes;

public class OldWayConfigureCity {

  public static void main(String[] args) {
    Electricity electricity = new Electricity();
    WaterPipes waterPipes = new WaterPipes();
    Pipeline pipeline = new Pipeline();

    City city = new City(electricity, waterPipes, pipeline);

    System.out.println(city);
  }

}
