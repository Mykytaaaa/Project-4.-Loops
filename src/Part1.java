import java.util.Scanner;

public class Part1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 1;
        while (a <= 0){
            System.out.println("Enter a positive number");
            a = in.nextInt();
        }

        int b = 1;
        do {
            System.out.println("Enter a positive number");
            b = in.nextInt();
        } while (b <= 0);

        System.out.println();

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println();

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        System.out.println();

        String str = "apple";
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }

        System.out.println();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
