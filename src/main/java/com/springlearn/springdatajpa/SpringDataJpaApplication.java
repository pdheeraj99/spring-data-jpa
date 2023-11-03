package com.springlearn.springdatajpa;

import java.util.List;

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

			// By default only findByID is there
			// But we need to implement findByFirstName, findByLastName....etc etc if we
			// required
			// in Student Repository

			// studentRepository.findById(1L).ifPresent(student ->
			// System.out.println(student.getFirstName()));

			List<Student> students = studentRepository.findByFirstName("second");
			students.forEach(student -> {
				System.out.println(student.getFirstName());
			});

			// Guardian guardian = Guardian.builder()
			// .name("guardian2")
			// .email("guardian2@gmail.com")
			// .mobile("1234567890")
			// .build();

			// Student student = Student.builder()
			// .emailId("second@gmail.com")
			// .firstName("second")
			// .lastName("member")
			// .guardian(guardian)
			// .build();
			// studentRepository.save(student);

			// List<Student> students = studentRepository.findAll();
			// System.out.println("Students: " + students);
		}
	}

}
