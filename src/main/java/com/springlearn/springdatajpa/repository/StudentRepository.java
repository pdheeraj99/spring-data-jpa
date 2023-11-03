package com.springlearn.springdatajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springlearn.springdatajpa.entity.Student;
import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByEmailId(String emailId);

    List<Student> findByFirstName(String firstName);

    // findBy<field_name><properties>
    // findBy<FirstName><Containing>
    // Student findByFirstNameContaining(String name);

}
