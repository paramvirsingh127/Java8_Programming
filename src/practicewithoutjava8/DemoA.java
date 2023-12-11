package practicewithoutjava8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class DemoA {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());

        PrintWriter wr = new PrintWriter(System.out);

        String[] arr_arr = br.readLine().split(" ");
        int[] arr = new int[n];

    }

}
