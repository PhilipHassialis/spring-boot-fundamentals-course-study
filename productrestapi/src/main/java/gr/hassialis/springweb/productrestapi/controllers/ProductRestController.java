package gr.hassialis.springweb.productrestapi.controllers;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import gr.hassialis.springweb.productrestapi.entities.Product;
import gr.hassialis.springweb.productrestapi.repos.ProductRepository;
import io.swagger.annotations.ApiOperation;

@RestController
public class ProductRestController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProductRestController.class);

    @Autowired
    private ProductRepository repository;

    @ApiOperation(value = "Retrieves all products", notes = "A list of products", response = Product.class, responseContainer = "List", produces = "application/json")
    @RequestMapping(value = "/products/", method = RequestMethod.GET)
    public List<Product> getProducts() {
        return repository.findAll();
    }

    @RequestMapping(value = "/products/{id}", method = RequestMethod.GET)
    @Cacheable("product-cache")
    public Product getProduct(@PathVariable("id") int id) {
        LOGGER.info("Finding product by Id:" + id);
        return repository.findById(id).get();

    }

    @RequestMapping(value = "/products/", method = RequestMethod.POST)
    public Product createProduct(@Valid @RequestBody Product product) {
        return repository.save(product);
    }

    @RequestMapping(value = "/products/", method = RequestMethod.PUT)
    public Product updateProduct(@Valid @RequestBody Product product) {
        return repository.save(product);
    }

    @RequestMapping(value = "/products/{id}", method = RequestMethod.DELETE)
    @CacheEvict("product-cache")
    public void deleteProduct(@PathVariable("id") int id) {
        repository.deleteById(id);
    }

}