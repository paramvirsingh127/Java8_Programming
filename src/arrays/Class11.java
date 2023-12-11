package arrays;


public class Class11 {
    public static void main(String[] args) {
        int n=7;

        if (fizzbuzz(n)){
            System.out.println(n+" number is not prime number ");
        }
        else {
            System.out.println(n+"number is  prime number");
        }
    }
    static boolean fizzbuzz(int n){
        if (n<=1){
            return false;
        }
        for(int i=2;i< Math.sqrt(n);i++){
            if (n%i==0){
                return false;
            }else
            {
                return true;
            }
        }
        return true;
    }


}





