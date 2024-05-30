package threadClass;

public class ExtendingThreadClass {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        FirstTask t1 = new FirstTask();
        secondTask t2 = new secondTask();
        ThirdTask t3 = new ThirdTask();

        System.out.println("\nStarting First Thread");
        t1.start();
        System.out.println("\nStarting Second Thread");
        t2.start();
        System.out.println("\nStarting Third Thread");
        t3.start();

        long endTime = System.currentTimeMillis();
        System.out.printf("%s Total time taken: %d",
                Thread.currentThread().getName(),
                (endTime - startTime));
    }

}
