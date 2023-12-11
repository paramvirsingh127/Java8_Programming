package functional;

public class FuntionalClass implements Funtionalinterface {

    @Override
    public void sayload(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        FuntionalClass fr= new FuntionalClass();
        fr.sayload("Hello paramvir");
    }
}
