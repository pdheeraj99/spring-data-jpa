package com.springlearn.springdatajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springlearn.springdatajpa.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
