
import java.util.Scanner;


class SimpleNums{

    public static void box (int min ,int max){
        for (int i = min; i <= max; i++) {
            boolean isPrime = true;//флаг
            for (int j = 2; j <= Math.floor(Math.sqrt(i)); j++){/
                if ((i % j) == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.print(i + " ");
            }
        }
    }


    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Set min:");
        int x = in.nextInt();
        System.out.print("Set max:");
        int y = in.nextInt();
        in.close();
        box(x,y);
    }

}