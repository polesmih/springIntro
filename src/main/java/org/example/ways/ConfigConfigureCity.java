package org.example.ways;

import org.example.locality.City;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigConfigureCity {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext annotationConfigApplicationContext
        = new AnnotationConfigApplicationContext(CityConfig.class);

    City city = annotationConfigApplicationContext.getBean(City.class);

    System.out.println(city);
  }

}
