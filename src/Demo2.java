import task2.BubbleSortStrategy;
import task2.IntArray;
import task2.SelectionSortStrategy;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // === Створення масиву користувачем ===
        IntArray arr = new IntArray(inputArray(sc));
        System.out.println("Початковий масив:");
        arr.print();

        while (true) {
            System.out.println("""
                    
                ================= МЕНЮ =================
                1 - Обрати алгоритм сортування
                2 - Встановити напрям сортування (↑/↓)
                3 - Виконати сортування
                4 - Ввести новий масив
                5 - Вивести масив
                0 - Вихід
                ==========================================
                """);

            System.out.print("> ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> chooseStrategy(arr, sc);
                case 2 -> chooseDirection(arr, sc);
                case 3 -> { arr.sort(); arr.print(); }
                case 4 -> { arr.setData(inputArray(sc)); System.out.println("Новий масив прийнято."); }
                case 5 -> arr.print();
                case 0 -> { System.out.println("Роботу завершено."); return; }
                default -> System.out.println("❗ Невірний вибір!");
            }
        }
    }

    private static void chooseStrategy(IntArray arr, Scanner sc) {
        System.out.println("""
                Оберіть алгоритм:
                1 - BubbleSort
                2 - SelectionSort
                """);
        System.out.print("> ");

        switch (sc.nextInt()) {
            case 1 -> arr.setStrategy(new BubbleSortStrategy());
            case 2 -> arr.setStrategy(new SelectionSortStrategy());
            default -> System.out.println(" Невірний вибір!");
        }
    }

    private static void chooseDirection(IntArray arr, Scanner sc) {
        System.out.println("""
                Оберіть напрям:
                1 - За зростанням
                2 - За спаданням
                """);
        System.out.print("> ");

        arr.setAscending(sc.nextInt() == 1);
    }

    private static int[] inputArray(Scanner sc) {
        System.out.println("Введіть кількість елементів масиву:");
        System.out.print("> ");
        int n = sc.nextInt();

        int[] data = new int[n];
        System.out.println("Введіть елементи масиву через пробіл:");
        for (int i = 0; i < n; i++) data[i] = sc.nextInt();

        return data;
    }
}
