package practicewithoutjava8;

public class Findmin {
    public static void main(String[] args) {
        int min[]= {1523,486,44,789,3,4,456};

        int minimum= min[0];
        for (int i=1; i<min.length; i++){
            if (min[i]<minimum){
                minimum=min[i];
            }
        }
        System.out.println(minimum);
    }
}
