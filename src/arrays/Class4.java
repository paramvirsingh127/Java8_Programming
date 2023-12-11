package arrays;

public class Class4 {
    public static void main(String[] args) {
        //int n=5;
        int a[]= {5,7,9,6,7};
        //int arr[]= new int[n];
        int ar=0;


        for (int i=0; i<a.length;i++) {
            if(a[i]/2==0) {
                ar += a[i];
                System.out.println(ar);
            }
        }

    }
}
