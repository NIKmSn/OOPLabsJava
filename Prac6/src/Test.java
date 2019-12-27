import java.util.Random;
public class Test {
    public static void insertionSort(Student[] students){
        for (int i = 1; i < students.length; i++) {
            Student key = students[i];
            int j = i - 1;
            while (j >= 0 && students[j].getId() > key.getId()) {
                students[j + 1] = students[j];
                j = j - 1;
            }
            students[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Student[] students = new Student[10];
        for (int i = 0; i < 10; i++) {
            students[i] = new Student(new Random().nextInt(100));
        }
        for (Student student: students) {
            System.out.print(student.toString());
        }
        System.out.println();
        insertionSort(students);
        System.out.println("Sorted: ");
        for (Student student: students) {
            System.out.print(student.toString());
        }
        System.out.println();
    }
}
