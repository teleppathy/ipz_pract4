package task1;

import java.util.*;

public class Alphabet implements Iterator<Student> {
    private List<Student> sorted;
    private int index = 0;

    public Alphabet(List<Student> students) {
        this.sorted = new ArrayList<>(students);
        this.sorted.sort(Comparator.comparing(Student::getName));
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
