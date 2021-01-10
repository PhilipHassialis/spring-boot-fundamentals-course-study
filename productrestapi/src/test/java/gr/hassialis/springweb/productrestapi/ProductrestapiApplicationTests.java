package gr.hassialis.springweb.productrestapi;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import gr.hassialis.springweb.productrestapi.entities.Product;

@SpringBootTest
class ProductrestapiApplicationTests {

	@Value("${productrestapi.services.url}")
	private String baseUrl;

	@Test
	void testGetProduct() {
		System.out.println(baseUrl);
		RestTemplate restTemplate = new RestTemplate();
		Product product = restTemplate.getForObject(baseUrl + "1", Product.class);
		assertNotNull(product);
		assertEquals("Samsung A71", product.getName());

	}

	@Test
	void createProduct() {
		RestTemplate restTemplate = new RestTemplate();
		Product product = new Product();
		product.setName("Macbook Air");
		product.setDescription("M1 Silicon");
		product.setPrice(1200);
		Product newProduct = restTemplate.postForObject(baseUrl, product, Product.class);
		assertNotNull(newProduct);
		assertNotNull(newProduct.getId());
		assertEquals("Macbook Air", newProduct.getName());
	}

	@Test
	void testUpdateProduct() {

		RestTemplate restTemplate = new RestTemplate();
		Product product = restTemplate.getForObject(baseUrl + "3", Product.class);
		product.setPrice(1500);
		restTemplate.put(baseUrl, product);

	}

}
