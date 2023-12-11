package threadmethod;
class cunstrunctionclass extends Thread{
    public cunstrunctionclass(String name){
        super(name);
    }
    public void run(){
        System.out.println("my name is paramvir singh");
    }
}
public class CunstructionThread {
    public static void main(String[] args) {
        cunstrunctionclass c= new cunstrunctionclass("wonderfully");
        c.start();
        System.out.println(c.getId());
        System.out.println(c.getName());

    }

}
