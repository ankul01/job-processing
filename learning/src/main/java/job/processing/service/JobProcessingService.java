package job.processing.service;

import job.processing.Job;

public interface JobProcessingService {

    void run(Job job, long futureExecutionTimeInMillis);
}
