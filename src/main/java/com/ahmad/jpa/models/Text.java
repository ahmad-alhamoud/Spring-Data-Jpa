package com.ahmad.jpa.models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
//@DiscriminatorValue("T")
@Entity
//@PrimaryKeyJoinColumn(name = "text_id")
public class Text extends Resource{

    private String content;
}
