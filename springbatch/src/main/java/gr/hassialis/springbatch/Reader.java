package gr.hassialis.springbatch;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

public class Reader implements ItemReader<String> {

    private String[] names = { "Philip Hassialis", "Menios Lambropoulos", "Kostas Kasoumis" };
    private int count = 0;

    @Override
    public String read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
        System.out.println("Inside read method");
        if (count < names.length) {
            return names[count++];
        } else {
            count = 0;
        }
        return null;
    }

}
