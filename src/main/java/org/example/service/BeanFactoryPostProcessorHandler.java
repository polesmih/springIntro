package org.example.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class BeanFactoryPostProcessorHandler implements BeanFactoryPostProcessor {
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("BeanFactoryPostProcessor..");
        // Получение имен BeanDefinition всех бинов, объявленных пользователем
        String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();
        // Перебор массива для получения доступа к каждому имени
        for(String name: beanDefinitionNames) {
            // Получение BeanDefinition по имени
            BeanDefinition beanDefinition = beanFactory.getBeanDefinition(name);
            // Вывод информации о BeanDefinition
            if (beanDefinition.getBeanClassName() != null &&
                    beanDefinition.getBeanClassName().contains("org.example.")) {
                System.out.println(beanDefinition.toString());
            }
        }
    }
}
