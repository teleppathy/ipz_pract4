package task1;

import java.util.Iterator;
import java.util.Scanner;

public class Demo_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentCollection group = new StudentCollection();

        int n = readInt(sc, "Скільки студентів хочете додати? ");

        for (int i = 0; i < n; i++) {
            System.out.println("\nСтудент №" + (i + 1));
            System.out.print("Введіть ім'я: ");
            String name = sc.nextLine().trim();
            while (name.isEmpty()) {
                System.out.print("Ім'я не може бути пустим. Введіть ім'я: ");
                name = sc.nextLine().trim();
            }

            int grade = readInt(sc, "Введіть оцінку (ціле число): ");
            group.addStudent(new Student(name, grade));
        }

        System.out.println("\n================= РЕЗУЛЬТАТИ =================\n");

        // 1) Звичайний обхід
        System.out.println("=== Звичайний обхід (порядок додавання) ===");
        print(group.iterator());

        // 2) За алфавітом
        System.out.println("=== Обхід за алфавітом (за іменем) ===");
        print(group.alphabeticalIterator());

        // 3) За зростанням
        System.out.println("=== Обхід за оцінками: за зростанням ===");
        print(group.gradeAscendingIterator());

        // 4) За спаданням
        System.out.println("=== Обхід за оцінками: за спаданням ===");
        print(group.gradeDescendingIterator());

        sc.close();
    }

    private static int readInt(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = sc.nextLine().trim();
            try {
                return Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.out.println("Невірний формат числа. Спробуйте ще раз.");
            }
        }
    }

    private static void print(Iterator<Student> it) {
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println();
    }
}
