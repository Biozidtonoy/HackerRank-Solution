import java.util.Scanner;

public class java_datatypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            try {
                double expol = Math.pow(2, 63);
                double expoi = Math.pow(2, 31);
                long a = sc.nextLong();
                System.out.println(a + " can be fitted in:");
                if (a >= -128 && a <= 127) {
                    System.out.println("* byte\n* short\n* int\n* long");

                } else if (a >= -32768 && a <= 32767) {
                    System.out.println("* short\n* int\n* long");

                } else if (a >= -expoi && a <= expoi - 1) {
                    System.out.println("* int\n* long ");

                } else if (a >= -expol && a <= expol - 1) {
                    System.out.println("* long");
                }
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }
    }

}
