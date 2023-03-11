import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Soft {
    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        System.out.printf("Запись 'данные~число' ");
        String current = "";
        Map<String, String> map = new HashMap<>();
        String[] array;
        while (!current.equals("-1")) {
            current = f.nextLine();
            if (current.contains("~")) {
                if (current.contains("print")) {
                    array = current.replace("~", " ").split(" ");
                    String result = map.get(array[1]);
                    System.out.println(result);
                }else{
                    array = current.replace("~", " ").split(" ");
                map.put(array[1], array[0]);
                }
            } else if (!current.equals("-1")) {
                System.out.println("Хъюстон...!");
                break;
            } else {
                System.out.println("Конец работы");
            }
        }
        f.close();
    }
}