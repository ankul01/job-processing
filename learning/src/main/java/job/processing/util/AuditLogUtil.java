package job.processing.util;

import job.processing.AuditLog;

public class AuditLogUtil {

    private static final String FILE_NAME = "output.txt";

    public static void auditLog(AuditLog auditLog) {

        IOUtil.write(FILE_NAME, auditLog);

    }
}
