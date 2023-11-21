import java.util.Scanner;

public class java_end_of_file {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int linenumber = 1;
        while (sc.hasNext()) {

            String input = sc.nextLine();
            System.out.println(linenumber + " " + input);
            linenumber++;
        }

        sc.close();
    }
}
