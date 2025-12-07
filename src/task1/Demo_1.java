package task1;

import java.util.Iterator;

public class Demo_1 {
    public static void main(String[] args) {
        StudentCollection group = new StudentCollection();

        group.addStudent(new Student("Olena", 98));
        group.addStudent(new Student("Ivan", 75));
        group.addStudent(new Student("Petro", 85));

        System.out.println("Звичайний обхід:");
        print(group.iterator());

        System.out.println("За алфавітом:");
        print(group.alphabeticalIterator());

        System.out.println("За оцінками ↑:");
        print(group.gradeAscendingIterator());

        System.out.println("За оцінками ↓:");
        print(group.gradeDescendingIterator());
    }

    private static void print(Iterator<Student> it) {
        while (it.hasNext()) System.out.println(it.next());
        System.out.println();
    }
}
