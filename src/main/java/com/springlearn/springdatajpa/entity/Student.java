package com.springlearn.springdatajpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// This annotation is used to mark the class as a persistent entity ( ** persistent entity refers to an object that is mapped to a database table and can be stored and retrieved from the database. ** ), which means it will be mapped to a database table.
@Entity

// This annotation specifies the name of the database table that the entity will
// be mapped to. In this case, the table name is "student"
@Table(name = "student")

// This annotation is provided by the Lombok library and automatically generates
// getter and setter methods, as well as other common methods like toString(),
// equals(), and hashCode().
@Data

// This annotation is also provided by Lombok and generates a constructor with
// parameters for all fields in the class.
@AllArgsConstructor

// This annotation, again from Lombok, generates a default constructor with no
// parameters.
@NoArgsConstructor
@Builder
public class Student {

    // This annotation is from the Jakarta Persistence API and marks the studentId
    // field as the primary key of the entity.
    @Id
    private Long studentId;
    private String firstName;
    private String lastName;
    private String emailId;
    private String guardianName;
    private String guardianEmail;
    private String guardingMobile;
}
