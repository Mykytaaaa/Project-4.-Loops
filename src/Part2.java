import java.util.Scanner;

public class Part2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true){
            System.out.println("enter any string");
            String str = in.nextLine();
            for (int i = 0; i < str.length(); i++) {
                System.out.println(str.toUpperCase());
            }
            System.out.println("Continue?");
            String yn = in.nextLine();
            if (!yn.equals("y") && !yn.equals("Y"))
                break;
        }
    }
}
