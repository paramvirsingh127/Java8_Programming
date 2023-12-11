package heckerrank;

public class mergesortalgo {

    public static void main(String[] args) {
        //int a[]= {2,4,5,8};
        int A[] = {3, 7, 10, 11, 13, 19, 14, 45};
        int n = A.length;
        //int m=b.length;
        //int c[]=new int[n+m];
        int p = A[0];
        int r = A[n - 1];
        splitmerge(A, p, r);
        //mergesortalgoo(a,b,n, m,c);
    }

    public static void splitmerge(int[] A, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            splitmerge(A, p, q);
            splitmerge(A, q + 1, r);
            //mergesortalgoo(A, p, q-1, r);
        }
    }

    public static void mergesortalgoo(int a[], int b[], int n, int m, int[] c) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < n && j < m) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                i++;
                k++;
            } else {
                c[k] = b[j];
                j++;
                k++;

            }

        }
        while (i < n) {
            c[k] = a[i];
            i++;
            k++;
        }
        while (j < m) {
            c[k] = b[j];
            j++;
            k++;
        }
        for (int t = 0; t < c.length; t++) {
            System.out.print(c[t] + " ");
        }
    }


}
