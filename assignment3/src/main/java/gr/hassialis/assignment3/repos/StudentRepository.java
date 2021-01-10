package gr.hassialis.assignment3.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import gr.hassialis.assignment3.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
