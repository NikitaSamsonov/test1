
import java.util.Scanner;
import java.util.ArrayList;

public class trash { //TODO именование классов с заглавной буквы
    public static void main(String[] args) {
        ArrayList<String> box = new ArrayList<>(); //TODO объявляем переменную типов предка, то есть List
        String x = "exit"; //TODO желательно именовать переменные осмысленно, лучше сразу к этому привыкать
        while (true) {
            Scanner in = new Scanner(System.in);//TODO ресурсы необходимо закрывать по завершению программы, метод close()
            System.out.println("Введите продукт");
            String y = in.nextLine();//TODO желательно именовать переменные осмысленно, лучше сразу к этому привыкать
            box.add(y);
            if (box.contains(x)) {
                break;
            }
            box.forEach(System.out::println); //TODO желательно не оставлять пустые строки



        }
    }
}