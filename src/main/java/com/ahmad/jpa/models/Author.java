package com.ahmad.jpa.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;


@Entity
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Author extends BaseEntity {



    private String firstName;
    private String lastName;

    private Integer age;

    @Column(
            unique = true,
            nullable = false
    )
    private String email;


    @ManyToMany(mappedBy = "authors")
    private List<Course> courses;

}