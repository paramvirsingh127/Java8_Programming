package arrays;

import java.util.Scanner;

public class Class6 {
    public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);

        int n= sc.nextInt();
        int arr[] = new int[n];
        for (int i=0; i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("this is array elements list");
        for (int i=0; i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
