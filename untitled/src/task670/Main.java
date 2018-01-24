package task670;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] g) throws IOException {
        Scanner r = new Scanner(System.in);
        PrintWriter w = new PrintWriter(System.out);
        int n = r.nextInt();

        int a = 0;
        for (int i = 1; i <= n; i++) {
            if (!c(i)) n++;
            if (i == n) a = i;
        }

        w.print(a);
        w.close();
    }

    static boolean c(int n) {
        String q = String.valueOf(n);
        int z = q.length();
        boolean e = true;

        for (int j = 0; j < z - 1; j++) {
            char t = q.charAt(j);
            for (int i = j + 1; i < z; i++) {
                if (t == q.charAt(i)) {
                    e = false;
                    break;
                }
            }
        }
        return e;
    }
}