package job.processing;

public interface Job extends Runnable {
    void run();
    String getId();
}
