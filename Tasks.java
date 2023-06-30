import java.util.Scanner;
public class Tasks {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean choice = true;
        while (choice) {
            System.out.println("Укажите номер задачи:");
            System.out.println("1 - Задача 1:");
            System.out.println("2 - Задача 2:");
            System.out.println("0 - Завершение работы приложения");
            int num = Integer.parseInt(scanner.nextLine());
            switch (num) {
                case 1:
                    SumAndProduct();
                    break;
                case 2:
                    PrimeNumbers();
                    break;
                case 0:
                    System.out.println("Завершение работы приложения.");
                    choice = false;
                    break;
                default:
                    System.out.println("Неправильный ввод номера задачи,\n повторите ввод.");
                    break;
            }
        }
    }


    static void SumAndProduct() {
        System.out.println("Введите число N: ");
        int n = scanner.nextInt();
        int s = 0;
        int m = 1;
        for (int i = 1; i <= n; i++) {
            s += i;
            m *= i;
        }
        System.out.printf("Сумма чисел от 1 до %d равна %d, а произведение чисел от 1 до %d равно %d", n, s, n, m);
        System.out.println(" ");
    }


    static void PrimeNumbers() {
        System.out.println("Введите число N: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            boolean number = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0)
                    number = false;
            }
            if (number)
                System.out.print(i + " ");
            System.out.println(" ");
        }
    }
}