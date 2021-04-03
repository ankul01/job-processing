package job.processing.service.impl;

import job.processing.AuditLog;
import job.processing.Job;
import job.processing.service.JobProcessingService;
import job.processing.util.AuditLogUtil;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class JobProcessingServiceImp implements JobProcessingService {

    private ScheduledExecutorService scheduledThreadPool;

    public JobProcessingServiceImp(int poolSize) {
        scheduledThreadPool = Executors.newScheduledThreadPool(poolSize);
    }


    @Override
    public void run(Job job, long futureExecutionTimeInMillis) {

        String status = "SUCCESS";
        try {
            scheduledThreadPool.schedule(job, futureExecutionTimeInMillis, TimeUnit.MILLISECONDS);
        } catch (Exception e) {
           status = "FAILURE";
        }
        AuditLogUtil.auditLog(new AuditLog(job.getId(), status));
    }

}
