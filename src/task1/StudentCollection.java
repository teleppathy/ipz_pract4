package task1;

import java.util.*;

public class StudentCollection {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
    }

    public Iterator<Student> iterator() {
        return students.iterator(); // за додаванням
    }

    public Iterator<Student> alphabeticalIterator() {
        List<Student> copy = new ArrayList<>(students);
        copy.sort(Comparator.comparing(Student::getName));
        return copy.iterator();
    }

    public Iterator<Student> gradeAscendingIterator() {
        List<Student> copy = new ArrayList<>(students);
        copy.sort(Comparator.comparingInt(Student::getGrade));
        return copy.iterator();
    }

    public Iterator<Student> gradeDescendingIterator() {
        List<Student> copy = new ArrayList<>(students);
        copy.sort((a, b) -> b.getGrade() - a.getGrade());
        return copy.iterator();
    }
}
