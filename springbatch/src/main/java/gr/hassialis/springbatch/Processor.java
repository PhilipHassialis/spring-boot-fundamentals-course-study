package gr.hassialis.springbatch;

import org.springframework.batch.item.ItemProcessor;

public class Processor implements ItemProcessor<String, String> {

    @Override
    public String process(String arg0) throws Exception {
        System.out.println("Inside processor ");
        return "PROCESSED " + arg0.toUpperCase();
    }

}
