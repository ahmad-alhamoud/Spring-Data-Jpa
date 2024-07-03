package com.ahmad.jpa.models;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity
@EqualsAndHashCode(callSuper = true)
//@DiscriminatorValue("F")
//@PrimaryKeyJoinColumn(name = "file_id")
public class File extends Resource {

    private String type;
}
