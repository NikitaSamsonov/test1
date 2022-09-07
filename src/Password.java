import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);//TODO ресурсы необходимо закрывать по завершению программы, метод close()
        System.out.println("Set pass:");
        String x = in.nextLine();
        System.out.println("Get pass");
        while(true){
            String s = in.nextLine();
            if (x.equals(s)){
                System.out.println("GJ");
                break;
            } else {
                System.out.println("Wrong ");
            }
        }


    }







}
