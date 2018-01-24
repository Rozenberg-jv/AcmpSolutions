package task557;

import java.util.*;
import java.io.*;

public class Main {
    static int mo;
// смотри решение 2, оно быстрее
    public static void main(String[] args) throws IOException {
        long t = System.currentTimeMillis();
        PrintWriter pw;
        Scanner sc = new Scanner(new File("input.txt"));
        int m = sc.nextInt(), n = sc.nextInt();
        int x = sc.nextInt() - 1, y = sc.nextInt() - 1;
        mo = sc.nextInt();

        int[][] a1 = new int[n][n];
        int[][] a2 = new int[n][n];

        sc.nextLine();
        for (int i1 = 0; i1 < n; i1++) {
            for (int i2 = 0; i2 < n; i2++)
                a1[i1][i2] = sc.nextInt();
        }

        for (int i = 1; i < m; i++) {
            sc.nextLine();
            for (int i1 = 0; i1 < n; i1++) {
                for (int i2 = 0; i2 < n; i2++)
                    a2[i1][i2] = sc.nextInt();
            }

            a1 = matrixMulti(a1, a2);
        }

        pw = new PrintWriter(new File("output.txt"));
        System.out.println(System.currentTimeMillis() - t + " ms");
        System.out.println("answer: " + a1[x][y] % mo);
        pw.print(a1[x][y] % mo);
        pw.close();

    }

    static int[][] matrixMulti(int[][] a, int[][] b) {
        int n = a.length;
        int[][] res = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++)
                    res[i][j] += a[i][k] * b[k][j];
                if (res[i][j] >= mo) res[i][j] = res[i][j] % mo;
            }
        }
        return res;
    }

}