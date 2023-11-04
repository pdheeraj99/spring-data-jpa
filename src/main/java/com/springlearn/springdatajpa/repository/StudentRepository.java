package com.springlearn.springdatajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springlearn.springdatajpa.entity.Student;
import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findByFirstName(String firstName);

    // JPQL (Java Persistence Query Language) and Native queries are not the same.

    // JPQL is a database-agnostic query language that is part of the Java
    // Persistence API (JPA). It allows developers to write queries using entity
    // class names and attributes, rather than directly interacting with the
    // underlying database. JPQL queries are portable across different database
    // systems.
    // Native queries are SQL queries that are written in the
    // native SQL dialect of the underlying database. Native queries provide more
    // flexibility and allow developers to write custom SQL statements. However,
    // native queries are not portable and may differ between different database
    // systems.

    // *** JPQL *** (Can be used for any database mysql, postgresql, oracle, sqlite)
    // Student - class name
    // firstName - attribute name
    @Query("select s from Student s where s.firstName = ?1")
    // @Query("select s.firstName from Student s where s.firstName = ?1") => even we
    // can retrieve like this
    Student getStudentByFirstName(String firstName);

    // *** Native SQL *** (Can be used for only mysql database)
    // student_table - underlying database table name
    // first_name - underlying database attribute
    @Query(value = "SELECT * FROM student_table WHERE first_name = ?1", nativeQuery = true)
    Student getStudentByFirstNameNative(String firstName);

    // *** Native SQL Named Param
    @Query(value = "SELECT * FROM student_table WHERE first_name = :firstName", nativeQuery = true)
    Student getStudentByFirstNameNativeNamedParam(@Param("firstName") String firstName);

    @Modifying
    @Transactional
    @Query("update Student s set s.firstName = ?1 where s.emailId = ?2")
    int updateStudentNameByEmailId(String firstName, String emailId);

}
