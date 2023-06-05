import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String a = console.nextLine();
        String b = "Вячеслав";
        if (a.equals(b))
            System.out.println("Привет " + b);

        else {
            System.out.println("Нет такого имени");
        }
    }
}
