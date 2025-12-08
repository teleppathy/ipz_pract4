package task1;

import java.util.ArrayList;
import java.util.List;

public class StudentCollection implements Aggregate<Student> {

    private List<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator(students);
    }

    public Iterator<Student> alphabeticalIterator() {
        return new Alphabet(students);
    }

    public Iterator<Student> gradeAscendingIterator() {
        return new Gradeup(students);
    }

    public Iterator<Student> gradeDescendingIterator() {
        return new Grade(students);
    }
}
