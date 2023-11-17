import java.util.Scanner;

public class java_loops_II {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int s = a + b;
            System.out.print(s + " ");

            for (int j = 1; j < n; j++) {
                double expo = Math.pow(2, j);
                s += (b * expo);
                System.out.print(s + " ");
            }
            System.out.println();
        }

    }

}
