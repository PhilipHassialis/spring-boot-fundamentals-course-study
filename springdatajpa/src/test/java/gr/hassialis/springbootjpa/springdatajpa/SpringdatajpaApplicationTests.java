package gr.hassialis.springbootjpa.springdatajpa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import gr.hassialis.springbootjpa.springdatajpa.entities.Student;
import gr.hassialis.springbootjpa.springdatajpa.repos.StudentRepository;

@SpringBootTest
class SpringdatajpaApplicationTests {

	@Autowired
	private StudentRepository repository;

	@Test
	void testSaveStudent() {
		Student student = new Student();
		student.setId(1L);
		student.setName("Philip");
		student.setTestScore(50);
		repository.save(student);

		Student savedStudent = repository.findById(1L).get();

		assertNotNull(savedStudent);

		savedStudent.setName("Alexander");
		repository.save(savedStudent);

		Student updatedStudent = repository.findById(1L).get();
		assertEquals("Alexander", updatedStudent.getName());

		repository.deleteById(1L);

		assertFalse(repository.findById(1L).isPresent());

	}

}
