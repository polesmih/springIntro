package org.example.service;

import org.example.locality.City;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class BeanPostProcessorHandler implements BeanPostProcessor {

    public Object postProcessBeforeInitialization(Object bean, String beanName)
            throws BeansException {
            // В данном методе просто возвращаем бин
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName)
            throws BeansException {
            // Находим бин City
        if (bean instanceof City) {
            System.out.println("Проверка подключения города к инфраструктуре..");
            System.out.println(((City) bean).toString());
        }
        return bean;
    }
}