package top.productivitytools.GraphQlFlyway.Application.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import top.productivitytools.GraphQlFlyway.Application.entity.Person;
import top.productivitytools.GraphQlFlyway.Application.repository.PersonRepo;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class PersonService {
    private final PersonRepo personRepo;

    public List<Person> getAllEmployees() {
        return personRepo.findAll();
    }

    public Person getEmployeeById(Integer id) {
        Optional<Person> optionalEmployee = personRepo.findById(id);
        if (optionalEmployee.isPresent()) {
            return optionalEmployee.get();
        }
        log.info("Employee with id: {} doesn't exist", id);
        return null;
    }
}
