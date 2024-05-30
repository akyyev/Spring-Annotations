package com.codekerki.Spring.Annotations.controller;

public class Greeter {
    
    private String name;

    public Greeter(String name) {
        this.name = name;
    }

    public String toString() {
        return "Hello, " + this.name + "!";
    }
}
