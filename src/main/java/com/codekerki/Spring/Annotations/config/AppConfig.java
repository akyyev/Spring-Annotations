package com.codekerki.Spring.Annotations.config;

import com.codekerki.Spring.Annotations.controller.PizzaController;
import com.codekerki.Spring.Annotations.service.NonVegPizza;
import com.codekerki.Spring.Annotations.service.Pizza;
import com.codekerki.Spring.Annotations.service.VegPizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {

    @Bean
//    @Primary
    public Pizza vegPizza() {
        return new VegPizza();
    }

    @Bean
    public Pizza nonVegPizza() {
        return new NonVegPizza();
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public PizzaController pizzaController() {
        return new PizzaController(nonVegPizza());
    }
}
