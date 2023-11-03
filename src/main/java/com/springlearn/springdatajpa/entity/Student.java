package com.springlearn.springdatajpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// This annotation is used to mark the class as a persistent entity ( ** persistent entity refers to an object that is mapped to a database table and can be stored and retrieved from the database. ** ), which means it will be mapped to a database table.
@Entity
// This annotation specifies the name of the database table that the entity will
// be mapped to. In this case, the table name is "student"
@Table(name = "tbl_student", uniqueConstraints = {
        @UniqueConstraint(name = "student_email_unique", columnNames = "email_address")
})
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
// @Data
// @Builder
// public class Student {
// private String name;
// private int age;
// private String email;
// }
// // Usage (For this Builder is required)
// Student student = Student.builder()
// .name("John Doe")
// .age(20)
// .email("john.doe@example.com")
// .build();
// This builder class provides methods to set the values of the fields and a
// build() method to create an instance of the annotated class.
@Builder
public class Student {

    // The @Id annotation is from the Jakarta Persistence API and designates the
    // "studentId" field as the primary key of the entity.
    @Id
    // If your code is successfully fetching IDs, it's because the JPA provider is
    // creating a sequence in the database automatically. The "sequenceName" in
    // @SequenceGenerator is key to this process.
    // Think of it this way: @SequenceGenerator is like giving a name to your
    // magical spell, and @GeneratedValue is the incantation you use on the
    // "studentId" field to pickup up unique student IDs.
    @SequenceGenerator(name = "student_id_sequence", sequenceName = "student_id_sequence", allocationSize = 1)
    @GeneratedValue(generator = "student_id_sequence")
    private Long studentId;

    private String firstName;

    private String lastName;

    @Column(name = "email_address", nullable = false)
    private String emailId;

    private String guardianName;

    private String guardianEmail;

    private String guardingMobile;
}
