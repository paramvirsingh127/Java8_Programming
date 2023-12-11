package threadmethod;
class Runnable1 implements Runnable {

    @Override
    public void run() {
        System.out.println("my name is paramvir singh");
    }
    public void mymethod(){
        System.out.println("this is my private method");
    }
}
class  Runnable2 implements Runnable{
    @Override
    public void run(){
        System.out.println("my name, it will you listen");
    }
}
public class RunnableThread {
    public static void main(String[] args) {
        Runnable1 runnable1= new Runnable1();
        Runnable2 runnable2= new Runnable2();
        Thread tr1= new Thread(runnable1);
        Thread tr2= new Thread(runnable2);
        tr1.start();
        tr2.start();
    }



}
