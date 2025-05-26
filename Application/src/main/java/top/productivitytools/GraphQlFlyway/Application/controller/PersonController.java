package top.productivitytools.GraphQlFlyway.Application.controller;

import org.springframework.graphql.data.method.annotation.QueryMapping;
//import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import top.productivitytools.GraphQlFlyway.Application.entity.Person;

@Controller
public class PersonController {
    @QueryMapping
    public Person getPerson() {
        return new Person("John", "Doe");
    }

    // @SchemaMapping
    // public PersonAddress personAddress(Person person) {
    // return new PersonAddress("123 Main St");
    // }
}
