package practicewithoutjava8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.sql.SQLOutput;
import java.util.Arrays;

public class P1{

// A Java program to demonstrate
// working of recursion


            static void printFun(int test)
            {
                if (test < 1)
                    return;

                else {
                    System.out.printf("%d ", test);

                    // Statement 2
                    printFun(test - 1);

                    System.out.printf("%d ", test);
                    return;
                }
            }

            public static void main(String[] args)
            {
                int test = 3;
                printFun(test);
            }



}
