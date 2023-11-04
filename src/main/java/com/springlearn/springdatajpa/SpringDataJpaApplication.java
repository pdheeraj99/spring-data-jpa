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

	@Component
	public class MyCommandLineRunner implements CommandLineRunner {

		@Override
		public void run(String... args) throws Exception {

		}
	}

}
