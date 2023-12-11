package arrays;

import java.util.Scanner;

public class Class12 {
    static  void inputmethod(int []arr){

        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void takeinpurbyscanner(){
        // how to take input array by scanner

       Scanner sc = new Scanner(System.in);
        //System.out.println("Enter the array index length");
        //int n= sc.nextInt();

        int arr[] = new int[5];
        arr[0]= 4;
        arr[1]= 9;
        arr[2]= 8;
        arr[3]= 3;
        arr[4]= 2;

        /*System.out.println("Enter the element value of the array");
        for (int i=0; i<n;i++){
            arr[i]= sc.nextInt();
        }*/
        // copy method
        System.out.println("original array");

        inputmethod(arr.clone());            // we are using clone method for deep copy


        // trying to copy array
        int []arr_2= arr;
        inputmethod(arr_2);
        System.out.println("copy array");
        arr_2[0]= 5;
        arr_2[1]= 7;
        arr_2[2]= 9;

        System.out.println("print original arrar after changing arry");
        inputmethod(arr);
        System.out.println("print copy array after changing array");
        inputmethod(arr_2);

    }

    public static void main(String[] args) {

      takeinpurbyscanner();
    }

}
