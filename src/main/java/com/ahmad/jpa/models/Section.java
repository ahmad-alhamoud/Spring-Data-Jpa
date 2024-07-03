package com.ahmad.jpa.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;


@Entity
@Data
@NoArgsConstructor
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class Section extends BaseEntity{


    private String name;

    private String sectionOrder;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;


    @OneToMany(mappedBy = "section")
    private List<Lecture> lectures;

}