package practicewithoutjava8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class P2 {
    public static void main() throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the num");
        System.out.println("Enter the name");
        //int num= Integer.parseInt(br.readLine());
        int num= br.read();
        System.out.println(num-43);

        String name= br.readLine();
        System.out.println(name);
    }
}
