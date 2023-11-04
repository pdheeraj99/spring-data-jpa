package com.springlearn.springdatajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springlearn.springdatajpa.entity.CourseMaterial;

public interface CourseMaterialRepository extends JpaRepository<CourseMaterial, Long> {

}
