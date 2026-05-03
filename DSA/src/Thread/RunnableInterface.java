package Thread;

public class RunnableInterface implements Runnable{
    private String dish;
    RunnableInterface(String dish){
        this.dish = dish;
    }

    public void run(){
        System.out.println(dish + " is preprade by "+ Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new RunnableInterface("fish"));
        Thread t2 = new Thread(new RunnableInterface("sheep"));
        t1.start();
        t2.start();

    }
}
