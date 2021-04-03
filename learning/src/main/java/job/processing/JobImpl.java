package job.processing;

import job.processing.AuditLog;
import job.processing.Job;
import job.processing.util.AuditLogUtil;

public class JobImpl implements Job {

    private String jobId;

    public JobImpl(String jobId) {
        this.jobId = jobId;
    }

    @Override
    public void run() {
        System.out.println("Running job " + jobId);
        AuditLogUtil.auditLog(new AuditLog(this.getId(), "Processing"));
    }

    @Override
    public String getId() {
        return this.jobId;
    }
}
