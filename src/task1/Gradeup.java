package task1;

import java.util.*;

public class Gradeup implements Iterator<Student> {
    private List<Student> sorted;
    private int index = 0;

    public Gradeup(List<Student> students) {
        this.sorted = new ArrayList<>(students);
        this.sorted.sort(Comparator.comparingInt(Student::getGrade));
    }

    @Override
    public boolean hasNext() {
        return index < sorted.size();
    }

    @Override
    public Student next() {
        return sorted.get(index++);
    }
}
