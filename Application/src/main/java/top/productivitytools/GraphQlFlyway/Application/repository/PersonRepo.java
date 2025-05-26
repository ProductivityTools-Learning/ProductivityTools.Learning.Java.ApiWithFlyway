package top.productivitytools.GraphQlFlyway.Application.repository;

import top.productivitytools.GraphQlFlyway.Application.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository is an interface that provides access to data in a database
 */
public interface PersonRepo extends JpaRepository<Person, Integer> {
}
