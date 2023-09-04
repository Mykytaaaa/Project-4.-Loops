import java.util.Scanner;

public class Part3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true){
            System.out.println("enter any string");
            String str = in.nextLine();
            for (int i = str.length() - 1; i >= 0; i--) {
                System.out.print(str.charAt(i));
            }
            System.out.println("Continue?");
            String yn = in.nextLine();
            if (!yn.equals("y") && !yn.equals("Y"))
                break;
        }
    }
}
