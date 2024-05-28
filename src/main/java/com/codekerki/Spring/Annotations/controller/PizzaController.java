package com.codekerki.Spring.Annotations.controller;

import com.codekerki.Spring.Annotations.service.Pizza;
import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;

@Controller
public class PizzaController {

//    @Autowired
// @Lazy
    Pizza pizza;

    @Autowired
    public PizzaController(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getPizza() {
        return pizza.getPizza();
    }

    public void init() {
        System.out.println("Initialization Logic");
    }

    public void destroy() {
        System.out.println("Termination Logic");
    }
}