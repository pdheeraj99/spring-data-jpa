package com.springlearn.springdatajpa;

import org.springframework.beans.factory.annotation.Autowired;

// import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

// import com.springlearn.springdatajpa.entity.Course;
// import com.springlearn.springdatajpa.entity.CourseMaterial;
import com.springlearn.springdatajpa.repository.CourseMaterialRepository;
import com.springlearn.springdatajpa.repository.CourseRepository;

@SpringBootApplication
public class SpringDataJpaApplication {

	@Autowired
	CourseMaterialRepository courseMaterialRepository;

	@Autowired
	CourseRepository courseRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaApplication.class, args);
	}

	// The MyCommandLineRunner class is a component in the Spring Data JPA
	// application that implements the CommandLineRunner interface. It is
	// responsible for executing code when the application starts up.
	@Component
	public class MyCommandLineRunner implements CommandLineRunner {

		@Override
		public void run(String... args) throws Exception {
			// Course course = Course.builder().title("third").credit(3).build();
			// CourseMaterial courseMaterial =
			// CourseMaterial.builder().url("url3").course(course).build();

			// courseMaterialRepository.save(courseMaterial);

			// courseMaterialRepository.findAll().forEach(s -> System.out.println(s));

			courseRepository.findAll().forEach(s -> System.out.println(s));
		}
	}

}
