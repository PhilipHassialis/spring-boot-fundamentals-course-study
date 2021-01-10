package gr.hassialis.springbatch;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

public class MyJobListener implements JobExecutionListener {

    @Override
    public void afterJob(JobExecution arg0) {
        System.out.println("Job ended - " + arg0.getStatus().toString());
    }

    @Override
    public void beforeJob(JobExecution arg0) {
        System.out.println("Job started");
    }

}
