package gr.hassialis.batchcsvtodemo;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing
public class BatchcsvtodemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BatchcsvtodemoApplication.class, args);
	}

}
