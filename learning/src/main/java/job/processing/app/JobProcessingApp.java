package job.processing.app;

import job.processing.Job;
import job.processing.service.JobProcessingService;
import job.processing.JobImpl;
import job.processing.service.impl.JobProcessingServiceImp;

public class JobProcessingApp {
    public static void main(String[] args) {
        Job job1 = new JobImpl("Job1");
        Job job2 = new JobImpl("Job2");
        Job job3 = new JobImpl("Job3");
        Job job4 = new JobImpl("Job4");
        Job job5 = new JobImpl("Job5");

        JobProcessingService service = new JobProcessingServiceImp(5);
        service.run(job1, 10000);
        service.run(job2, 10);
        service.run(job3, 1);
        service.run(job4, 1000);
        service.run(job5, 100);

    }
}
