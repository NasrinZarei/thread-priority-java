package threadtest;
class LowPriorityThread extends Thread {
 
    @Override 
    public void run() {
      System.out.println(" this is priority 2");
            
    }
}
class HighPriorityThread extends Thread {
    
    @Override 
    public void run() {
        System.out.println(" this is priority 4");
    }
}

public class ThreadTest {
    public static void main(String[] args) throws Exception {
        LowPriorityThread thread1 = new LowPriorityThread();
        HighPriorityThread thread2 = new HighPriorityThread();
        thread1.setPriority(2);
        thread1.start();
        thread2.setPriority(4);
        thread2.start();
        
    }
}
