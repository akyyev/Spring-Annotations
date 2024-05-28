package com.codekerki.Spring.Annotations.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component("vegPizza")
//@Primary
public class VegPizza implements Pizza{

    @Override
    public String getPizza() {
        return "Veggie pizza";
    }
}
