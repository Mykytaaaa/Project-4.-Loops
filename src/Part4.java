import java.util.Scanner;

public class Part4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true){
            System.out.println("What is your favorite genre");
            String genre = in.nextLine();
            System.out.println("What is your favorite book size (pages)?");
            int bookSize = in.nextInt();
            System.out.print("Probably, you would like ");
            if (bookSize >= 400) {
                switch (genre)
                {
                    case "detective" -> System.out.println("Sherlock Holmes");
                    case "science fiction" -> System.out.println("I, robot");
                    case "fantasy" -> System.out.println("Harry Potter");
                    case "Ukrainian" -> System.out.println("Tyhrolovy");
                    case "ukrainian" -> System.out.println("Tyhrolovy");
                    default -> System.out.println("Tyhrolovy");
                }
            }
            else {
                switch (genre)
                {
                    case "detective" -> System.out.println("Sherlock Holmes");
                    case "science fiction" -> System.out.println("some of the Robert Sheckley's stories");
                    case "fantasy" -> System.out.println("Mio, min Mio");
                    case "Ukrainian" -> System.out.println("Haidamaky");
                    case "ukrainian" -> System.out.println("Haidamaky");
                    default -> System.out.println("Farbovany lys");
                }
            }

            in.nextLine();
            System.out.println("Continue?");
            String yn = in.nextLine();
            if (!yn.equals("y") && !yn.equals("Y"))
                break;
        }
    }
}
