package com.springlearn.springdatajpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Course {
   @Id
   @SequenceGenerator(name = "course_sequence", sequenceName = "course_sequence", allocationSize = 1)
   @GeneratedValue(generator = "course_sequence")
   private Long courseId;
   private String title;
   private Integer credit;

   @OneToOne(mappedBy = "course")
   private CourseMaterial courseMaterial;
}
