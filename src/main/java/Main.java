public class Main {
  public static void main(String[] args) throws Exception {
    ThreadGroup myThreadGroup = new ThreadGroup("my group");
    Thread myThread1 = new MyThread(myThreadGroup, "1");
    Thread myThread2 = new MyThread(myThreadGroup, "2");
    Thread myThread3 = new MyThread(myThreadGroup, "3");
    Thread myThread4 = new MyThread(myThreadGroup, "4");

    myThread1.start();
    myThread2.start();
    myThread3.start();
    myThread4.start();

    Thread.sleep(15000);
    myThreadGroup.interrupt();
  }
}

