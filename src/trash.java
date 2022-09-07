
import java.util.Scanner;
import java.util.ArrayList;

public class trash {
    public static void main(String[] args) {
        ArrayList<String> box = new ArrayList<>();
        String x = "exit";
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите продукт");
            String y = in.nextLine();
            box.add(y);
            if (box.contains(x)) {
                break;
            }
            box.forEach(System.out::println);


        }
    }
}