package com.ahmad.jpa.repositories;

import com.ahmad.jpa.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

    List<Author> findAllByFirstName(String firstName);

    List<Author> findAllByFirstNameIgnoreCase(String firstName);

    List<Author> findAllByFirstNameContainingIgnoreCase(String firstName);

    List<Author> findAllByFirstNameStartsWithIgnoreCase(String firstName);

    List<Author> findAllByFirstNameIsEndingWithIgnoreCase(String firstName);

    List<Author> findAllByFirstNameInIgnoreCase(List<String> firstName);

    List<Author> findAllByLastName(String lastName);

    List<Author> findAllByEmailStartsWithIgnoreCase(String email);

}
