package org.example.ways;

import org.example.locality.City;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlConfigureCity {

  public static void main(String[] args) {
    ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("context.xml");

    City city = classPathXmlApplicationContext.getBean(City.class);

    System.out.println(city);
  }

}
