package top.productivitytools.GraphQlFlyway.Application.controller;

import org.springframework.graphql.data.method.annotation.QueryMapping;
//import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import lombok.RequiredArgsConstructor;
import top.productivitytools.GraphQlFlyway.Application.entity.Person;
import top.productivitytools.GraphQlFlyway.Application.service.PersonService;

@Controller
@RequiredArgsConstructor
public class PersonController {

    private final PersonService personService;

    @QueryMapping
    public Person getPerson() {
        var person = personService.getEmployeeById(1);
        return person;
        // return new Person("John", "Doe");
    }

    // @SchemaMapping
    // public PersonAddress personAddress(Person person) {
    // return new PersonAddress("123 Main St");
    // }
}
