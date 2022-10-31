import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Демеш Алексей Иванович | 31.10.2022\n Введите своё имя.");

        Scanner work_one = new Scanner(System.in);

        String name = work_one.nextLine();

        System.out.println("Добро пожаловать: " + name);

    }
}