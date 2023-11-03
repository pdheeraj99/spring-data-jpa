package com.springlearn.springdatajpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.springlearn.springdatajpa.entity.Student;
import com.springlearn.springdatajpa.repository.StudentRepository;

@SpringBootApplication
public class SpringDataJpaApplication {

	@Autowired
	private StudentRepository studentRepository;

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
			Student student = Student.builder()
					.emailId("dheeraj@gmail.com")
					.firstName("dheeraj")
					.lastName("kumar")
					.guardianEmail("guardian1@gmail")
					.guardianName("guardian1")
					.guardingMobile("9999999999")
					.build();
			studentRepository.save(student);

			List<Student> students = studentRepository.findAll();
			System.out.println("Students: " + students);
		}
	}

}
