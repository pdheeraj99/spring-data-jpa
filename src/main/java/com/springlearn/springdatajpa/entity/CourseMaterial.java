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
// import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
// @ToString(exclude = "course") - used when LAZY
public class CourseMaterial {
   @Id
   @SequenceGenerator(name = "course_material_sequence", sequenceName = "course_material_sequence", allocationSize = 1)
   @GeneratedValue(generator = "course_material_sequence")
   private Long courseMaterialId;
   private String url;

   // In Join Column Annotation "course_id" is the name of the foreign key column
   // in the CourseMaterial
   // table, and "courseId" is the name of the column in the Course table that the
   // foreign key column is referencing.

   // In the given code snippet, *** jakarta.persistence.FetchType.EAGER *** is
   // used for
   // the Course entity in the CourseMaterial class. This means that when a
   // CourseMaterial object is fetched from the database, the associated Course
   // object will also be fetched immediately.

   // On the other hand, *** jakarta.persistence.FetchType.LAZY *** is not used in
   // the
   // given code snippet. However, it can be used to specify that the Course object
   // should be fetched lazily, i.e., only when it is accessed by the application
   // code.

   // Note that the FetchType is used in conjunction with the @OneToOne annotation
   // to define the relationship between entities in JPA.

   @OneToOne(cascade = CascadeType.ALL, fetch = jakarta.persistence.FetchType.EAGER)
   @JoinColumn(name = "courseId", referencedColumnName = "courseId")
   // OUTPUT - CourseMaterial(courseMaterialId=1,
   // url=url3,course=Course(courseId=1, title=third, credit=3))

   // @OneToOne(cascade = CascadeType.ALL, fetch =
   // jakarta.persistence.FetchType.LAZY)
   // @JoinColumn(name = "courseId", referencedColumnName = "courseId")
   // OUTPUT - CourseMaterial(courseMaterialId=1, url=url3)
   private Course course;
}
