package com.springlearn.springdatajpa;

// import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

// import com.springlearn.springdatajpa.entity.Guardian;
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

			// JPQL Way
			Student st = studentRepository.getStudentByFirstName("second");
			System.out.println(st);

			// Native SQL Key
			Student st1 = studentRepository.getStudentByFirstNameNative("first");
			System.out.println(st1);

			// Native SQL Named Param
			Student st2 = studentRepository.getStudentByFirstNameNativeNamedParam("first");
			System.out.println(st2);
		}
	}

}
