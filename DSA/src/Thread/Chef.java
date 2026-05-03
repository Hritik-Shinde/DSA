package Thread;

public class Chef extends Thread {

    private String  task;

    public Chef(String task) {
        this.task = task;
    }

    public void run(){
        System.out.println(task+ " is preprade by"+ Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread t1 = new Chef("pizza");
        Thread t2 = new Chef("burger");
        t1.start();
        t2.start();

    }
}
