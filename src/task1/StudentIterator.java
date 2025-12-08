package task1;

import java.util.List;

public class StudentIterator implements Iterator<Student> {
    private final List<Student> students;
    private int index = 0;

    public StudentIterator(List<Student> students) {
        this.students = students;
    }

    @Override
    public boolean hasNext() {
        return index < students.size();
    }

    @Override
    public Student next() {
        return students.get(index++);
    }
}
