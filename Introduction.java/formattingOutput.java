import java.util.Scanner;

/**
 * formattingOutput
 */
public class formattingOutput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            String str = String.format("%-15s", s1);
            String digi = String.format("%03d", x);
            System.out.println(str + digi);
        }
        System.out.println("================================");
        sc.close();
    }
}