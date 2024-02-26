package Threads;

class Source {
    void display() {
        System.out.println("Source Class Displayed" + "\n");
    }
}

class Load extends Source implements Runnable {
    public void run() {
        System.out.println("Loadings Sections" + "\n");

        for (int i = 0; i < 5; i++) {
            System.out.println("Loadings : " + i);
        }
        System.out.println("\n");
    }
}

class Count extends Thread {
    public void run() {
        System.out.println("Countings Sections" + "\n");

        for (int i = 0; i < 5; i++) {
            System.out.println("Countings : " + i);
        }
    }
}

public class ThreadInterface {
    public static void main(String[] args) throws InterruptedException {
        Load load = new Load();
        Count count = new Count();

        Thread thread = new Thread(load);
        thread.setPriority(Thread.MIN_PRIORITY);

        count.setPriority(Thread.MAX_PRIORITY);

        thread.start();
        count.start();

        thread.join(); // Waiting for the 'thread' to complete
        count.join(); // Waiting for the 'count' to complete
    }
}
