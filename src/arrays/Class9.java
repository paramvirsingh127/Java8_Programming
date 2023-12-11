package arrays;

public class Class9 {

    void multipleArr(){
        // type of array 2D 3D
        int arr[][]= {{2,3,5},{7,85,94,},{9,7,8}};
        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[0][2]);
        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);
        System.out.println(arr[1][2]);
        System.out.println(arr[2][0]);
        System.out.println(arr[2][1]);
        System.out.println(arr[2][2]);
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                System.out.println(arr[i][j]);
            }
        }

    }

    void sumArr(){
        int arrsum[]= {45,7,9,8,25,32,45};
        int sum=0;
        for (int i=0; i<arrsum.length;i++){
            sum += arrsum[i];
        }
        System.out.println(sum);

    }
    void maxArr(){
        int maxarr[]= {45,78,36,25,12,78};
        int max=0;
        for (int i=0;i<maxarr.length;i++){
            if (maxarr[i]>max){
                max = maxarr[i];

            }
        }
        System.out.println(max);
    }
    //todo we have to find x equal value is present return or not return -1
     void compare(){
        int comparr[] = {45,78,32,6,14,25,36};
        int x=6;
        int ans= -1;
        for (int i=0;i<comparr.length;i++) {
            if (comparr[i] == x){
                ans = comparr[i];
                break;
            }
        }
         System.out.println(ans);

     }
    public static void main(String[] args) {
        Class9 fi= new Class9();
        fi.multipleArr();
        fi.sumArr();
        fi.maxArr();
        fi.compare();



    }
}
