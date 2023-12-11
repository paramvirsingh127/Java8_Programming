package threadmethod;

class thread1 extends Thread{
    @Override
    public void run() {
        int i=2;
        while (i==2) {
            System.out.println("paramvir is good boy");
            System.out.println("Because he is honest person and intelligent student");
            i++;
        }

    }
}
   class thread2 extends Thread{
       @Override
       public void run() {
           System.out.println("paramvir is a software developer");
       }
   }
public class MultipleThread {
    public static void main(String[] args) {
        thread1 t1= new thread1();
        thread2 t2 = new thread2();
        t1.start();
        t2.start();
        System.out.println(t1.getId());
    }
}
