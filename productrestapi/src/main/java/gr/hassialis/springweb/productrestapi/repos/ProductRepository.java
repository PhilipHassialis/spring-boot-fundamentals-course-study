package gr.hassialis.springweb.productrestapi.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import gr.hassialis.springweb.productrestapi.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}