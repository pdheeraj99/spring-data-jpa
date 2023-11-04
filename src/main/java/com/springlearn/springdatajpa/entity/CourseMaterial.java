package com.springlearn.springdatajpa.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
public class CourseMaterial {
   @Id
   @SequenceGenerator(name = "course_material_sequence", sequenceName = "course_material_sequence", allocationSize = 1)
   @GeneratedValue(generator = "course_material_sequence")
   private Long courseMaterialId;
   private String url;

   // "course_id" is the name of the foreign key column in the CourseMaterial
   // table, and "courseId" is the name of the column in the Course table that the
   // foreign key column is referencing.

   @OneToOne(cascade = CascadeType.ALL)
   @JoinColumn(name = "courseId", referencedColumnName = "courseId")
   private Course course;
}
