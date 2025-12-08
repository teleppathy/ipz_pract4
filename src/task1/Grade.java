package task1;

import java.util.*;

public class Grade implements Iterator<Student>{
    private List<Student> sorted;
    private int index = 0;

    public Grade(List<Student> students) {
        this.sorted = new ArrayList<>(students);
        this.sorted.sort((a, b) -> b.getGrade() - a.getGrade());
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
