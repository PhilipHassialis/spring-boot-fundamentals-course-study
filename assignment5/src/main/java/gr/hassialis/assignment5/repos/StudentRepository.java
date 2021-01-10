package gr.hassialis.assignment5.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import gr.hassialis.assignment5.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
