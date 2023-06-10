class threadprority extends Thread{
    private String name;

    void threadpriority(String name) {
        this.name = name;

    }

    public void run(){
for(int i=1 ; i<=5 ; i++){
    System.out.println("Thread" + name + "running with priority" + getPriority());

     }

  }

}

public class threadpriority {
    public threadpriority(String string) {
    }

    public static void main(String[] args) {
        threadpriority thread1 = new threadpriority("Thread 1");
        threadpriority thread2 = new threadpriority("Thread 2");
        threadpriority thread3 = new threadpriority("Thread 3");

        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.NORM_PRIORITY);
        thread3.setPriority(Thread.MAX_PRIORITY);

        thread1.start();
        thread2.start();
        thread3.start();

        
    }

    private void start() {
    }

    private void setPriority(int minPriority) {
    }
}