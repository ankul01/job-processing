package job.processing.util;

import job.processing.AuditLog;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class IOUtil {

    public static void write(String fileName, AuditLog log) {
        try {
            FileWriter fileReader = new FileWriter(fileName, true); // A stream that connects to the text file
            BufferedWriter bufferedWriter = new BufferedWriter(fileReader); // Connect the FileWriter to the BufferedWriter

            bufferedWriter.write(log.toString() + "\n");

            bufferedWriter.close (); // Close the stream
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
