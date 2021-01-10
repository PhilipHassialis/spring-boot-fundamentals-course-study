package gr.hassialis.springbatch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

public class Writer implements ItemWriter<String> {

    @Override
    public void write(List<? extends String> arg0) throws Exception {
        System.out.println("Inside write");
        System.out.println("Writing data: " + arg0);
    }

}
