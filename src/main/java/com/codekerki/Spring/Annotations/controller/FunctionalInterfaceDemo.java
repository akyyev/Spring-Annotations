package com.codekerki.Spring.Annotations.controller;

import java.util.List;
import java.util.function.Function;

import org.springframework.stereotype.Component;

@Component
public class FunctionalInterfaceDemo {
    
    {
        var names = List.of("John", "Gary", "Doe");

        names.stream().map(greetFunction())
        .forEach(System.out::println);
    }

    public Function<String, Greeter> greetFunction() {
        return str -> new Greeter(str);
    }

}
