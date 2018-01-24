package task579_2;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] argv) throws IOException {
        Scanner s = new Scanner(new File("input.txt"));

        int n = s.nextInt();
        int num, pos = 0, neg = 0;
        List<Integer> listN = new ArrayList<>();
        List<Integer> listP = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            num = s.nextInt();
            if (num < 0) {
                listN.add(i + 1);
                neg += num;
            } else if (num > 0) {
                listP.add(i + 1);
                pos += num;
            }
        }

        StringBuilder h = new StringBuilder();

        if (pos == 0 & neg == 0) {
            h.append(0);
        } else {
            if (pos > Math.abs(neg)) {
                h.append(listP.size()).append("\n");
                for (Integer q : listP)
                    h.append(q).append(" ");
            } else {
                h.append(listN.size()).append("\n");
                for (Integer q : listN)
                    h.append(q).append(" ");
            }
        }

        PrintWriter w = new PrintWriter(new File("output.txt"));
        w.print(h.toString().trim());
        w.close();
    }
}