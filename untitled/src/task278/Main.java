package task278;

import java.io.*;

public class Main {
    public static void main(String[] a) throws IOException {
        BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
        String y = s.readLine();
        String h = s.readLine();
        int p = 0;
        String r;

        if ("".equals(y)) r = "YES";
        else if ("".equals(h)) r = "NO";
        else {
            for (int i = 0; i < h.length(); i++) {
                if (h.charAt(i) == y.charAt(p)) {
                    p++;
                    if (p == y.length()) break;
                }
            }
            if (p == y.length()) r = "YES";
            else r = "NO";
        }
        PrintWriter w = new PrintWriter(System.out);
        w.print(r);
        w.close();
    }
}