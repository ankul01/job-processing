package job.processing;

import java.util.Date;
import java.util.StringJoiner;

public class AuditLog {
    private Date time;
    private String job;
    private String status;

    public AuditLog(String job, String status) {
        this.time = new Date();
        this.job = job;
        this.status = status;
    }

    public Date getTime() {
        return time;
    }

    public String getStatus() {
        return status;
    }

    public String getJob() {
       return job;
    }


    @Override
    public String toString() {
        return new StringJoiner(", ", AuditLog.class.getSimpleName() + "[", "]")
                .add("time=" + time)
                .add("job='" + job + "'")
                .add("status='" + status + "'")
                .toString();
    }
}
