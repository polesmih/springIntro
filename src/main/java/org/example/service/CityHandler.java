package org.example.service;

import org.example.locality.City;
import org.springframework.stereotype.Component;

@Component
public class CityHandler {

    private final City city;

    public CityHandler(City city) {
        this.city = city;

        System.out.println("Init ..." + city.toString());
    }

}
