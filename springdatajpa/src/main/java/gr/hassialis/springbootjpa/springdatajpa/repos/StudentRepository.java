package gr.hassialis.springbootjpa.springdatajpa.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import gr.hassialis.springbootjpa.springdatajpa.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}