package arrays;

public class Class2_rotateArray {

    static void reversearray(int arr[]) {


        int add[]= new int[arr.length];
        int j=0;
        for (int i= arr.length-1;i>=0;i--){
            add[j++]= arr[i];
        }
        for (int i=0;i< add.length;i++){
            System.out.print(add[i]+" ");
        }
    }
    static void swapInarray(int arr[],int i, int j){
        int temp= arr[i];
        arr[i]= arr[j];
        arr[j]= temp;

    }
    static void reversearraybyswap(int arr[]){
        int i=0, j= arr.length-1;
        while (i<j) {
            swapInarray(arr,i, j);
            i++;
            j--;
        }
        for (i=0;i<arr.length;i++)
        System.out.println(arr[i]);
    }

    static void rotate(int arr[], int k){
        int n= arr.length;
       k= k%n;


    }
    public static void main(String[] args) {
        int arr[] = {4,8,9,3,4,6};
      //reversearray(arr);
      //reversearraybyswap(arr);
        rotate(arr,1);

    }
}
