package arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Class1 {
    public static void main(String[] args) {
        //maximum = 3,3,-1, 5,5,6,7
                int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
                int windowSize = 2;
                List<Integer> output = new ArrayList<>();

                for (int i = 0; i <= arr.length - windowSize; i++) {
                    int maxVal = Arrays.stream(Arrays.copyOfRange(arr, i, i + windowSize)).max().orElse(Integer.MIN_VALUE);
                    output.add(maxVal);
                }

                // Displaying the output
                for (int val : output) {
                    System.out.print(val + " ");
                }
            }
        }




