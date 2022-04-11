package org.example.ways;

import org.example.locality.City;
import org.example.system.Electricity;
import org.example.system.Pipeline;
import org.example.system.WaterPipes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
class CityConfig {

  @Bean
  public Electricity getElectricity() {
    return new Electricity();
  }

  @Bean
  public WaterPipes getWaterPipes() {
    return new WaterPipes();
  }

  @Bean
  public Pipeline getPipeline() {
    return new Pipeline();
  }

  @Bean
  public City getCity(Electricity electricity, WaterPipes waterPipes, Pipeline pipeline) {
    return new City(electricity, waterPipes, pipeline);
  }
}
