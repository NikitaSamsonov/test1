
import java.util.Scanner;


public class MoreThan {

    public static void value(int num_1, int num_2){
        if (num_1 > num_2){
            System.out.print("Num1 bigger" );
        } else {
            System.out.print("Num2 bigger");
        }
    }

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.print("Set num1:");
       int x = in.nextInt();
       System.out.print("Set num2:");
       int y = in.nextInt();
       in.close();
       value(x,y);
    }

}
