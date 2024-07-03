package com.ahmad.jpa.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@SuperBuilder
@Inheritance(strategy = InheritanceType.JOINED)
//@DiscriminatorColumn(name = "resource_type", discriminatorType = DiscriminatorType.STRING) // Only with single table
public class Resource {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;
    private Integer size ;

    private String url;




}