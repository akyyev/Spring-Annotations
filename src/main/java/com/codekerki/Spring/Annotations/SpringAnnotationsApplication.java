package com.codekerki.Spring.Annotations;

import com.codekerki.Spring.Annotations.configproperties.AppPropDemo;
import com.codekerki.Spring.Annotations.controller.PizzaController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAnnotationsApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(SpringAnnotationsApplication.class, args);

		var pizzaController = context.getBean(PizzaController.class);
		System.out.println("pizzaController.getPizza() = " + pizzaController.getPizza());

        var appProp = context.getBean(AppPropDemo.class);
        appProp.display();
	}

}
