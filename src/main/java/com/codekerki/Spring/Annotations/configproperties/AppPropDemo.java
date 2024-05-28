package com.codekerki.Spring.Annotations.configproperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AppPropDemo {

    @Autowired AppProperties properties;

    public void display() {
        System.out.println(properties.getName());
        System.out.println(properties.getDescription());
        System.out.println(properties.getUploadDir());

        System.out.println(properties.getSecurity().getUsername());
        System.out.println(properties.getSecurity().getPassword());
        System.out.println(properties.getSecurity().getRoles().get(0));

        System.out.println(properties.getSecurity().getPermissions());
    }
}
