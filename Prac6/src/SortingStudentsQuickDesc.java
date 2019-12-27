import java.util.Comparator;
import java.util.Random;

public class SortingStudentsQuickDesc implements Comparator<Student> {
    public static void QuickSortDesc(Student[] students, int startIndex, int endIndex){
        if (students.length <= 1)
            return;
        if (startIndex > endIndex)
            return;
        int m = startIndex+(endIndex-startIndex)/2;
        Student pivot = students[m];
        int i = startIndex;
        int j = endIndex;
        while (i < j){
            while (new SortingStudentsQuickDesc().compare(students[i], pivot) > 0)
                i++;
            while (new SortingStudentsQuickDesc().compare(students[j], pivot) < 0)
                j--;
            if (i < j) {
                Student t = students[i];
                students[i] = students[j];
                students[j] = t;
                i++;
                j--;
            }
            if (startIndex < j){
                QuickSortDesc(students, startIndex, j);
            }
            if (endIndex > j){
                QuickSortDesc(students, j+1, endIndex);
            }
        }
    }
    public static void main(String[] args) {
        Student[] students = new Student[10];
        for (int i = 0; i < 10; i++) {
            students[i] = new Student(new Random().nextInt(100));
        }
        for (Student student : students) {
            System.out.print(student.toString());
        }
        System.out.println();
        QuickSortDesc(students, 0, students.length-1);
        System.out.println("Sorted: ");
        for (Student student : students) {
            System.out.print(student.toString());
        }
        System.out.println();
    }

    @Override
    public int compare(Student student1, Student student2) {
        return student1.getId() - student2.getId();
    }
}
