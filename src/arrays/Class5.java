package arrays;

public class Class5 {
    public static void main(String[] args) {
        int a1[]={1,2,3,4};
        int a2[]= {1,2,3,5};
        char[] same= new char[0];
        int different =0;

        for (int i=0;i<a1.length;i++) {
            for (int j=0;j<a2.length;j++){
                if (a1[i]==a2[j]){

                    System.out.println(a1[i]);

                }

            }

            /*if (Arrays.equals(a1, a2)) {
                same += a1[i];
                System.out.println("same"+same);
            } else {
                System.out.println("not same");
            }*/
        }
    }
}
